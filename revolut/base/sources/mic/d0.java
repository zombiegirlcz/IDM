package mic;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f205655a = new d0();

    public d0() {
        super(1, Data.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new Data((Boolean) obj2, null, false, 6, null);
    }
}
