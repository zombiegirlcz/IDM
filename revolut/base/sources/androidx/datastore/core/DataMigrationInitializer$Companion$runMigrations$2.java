package androidx.datastore.core;

import fim.a;
import gim.d;
import gim.i;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@d(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer$Companion$runMigrations$2<T> extends i implements Function2<T, Continuation<? super T>, Object> {
    final /* synthetic */ List<Function1<Continuation<? super Unit>, Object>> $cleanUps;
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<Function1<Continuation<? super Unit>, Object>> list2, Continuation<? super DataMigrationInitializer$Companion$runMigrations$2> continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj2;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        List<Function1<Continuation<? super Unit>, Object>> list;
        Iterator<T> it8;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            obj2 = this.L$0;
            List<DataMigration<T>> list2 = this.$migrations;
            list = this.$cleanUps;
            it8 = list2.iterator();
        } else if (i == 1) {
            Object obj3 = this.L$3;
            if (this.L$2 != null) {
                throw new ClassCastException();
            }
            Iterator<T> it9 = (Iterator) this.L$1;
            List<Function1<Continuation<? super Unit>, Object>> list3 = (List) this.L$0;
            o.b(obj2);
            if (((Boolean) obj2).booleanValue()) {
                list3.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(null, null));
                this.L$0 = list3;
                this.L$1 = it9;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                throw null;
            }
            obj2 = obj3;
            it8 = it9;
            list = list3;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it8 = (Iterator) this.L$1;
            list = (List) this.L$0;
            o.b(obj2);
        }
        if (!it8.hasNext()) {
            return obj2;
        }
        if (it8.next() != null) {
            throw new ClassCastException();
        }
        this.L$0 = list;
        this.L$1 = it8;
        this.L$2 = null;
        this.L$3 = obj2;
        this.label = 1;
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(T t2, Continuation<? super T> continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(t2, continuation)).invokeSuspend(Unit.f186387a);
    }
}
