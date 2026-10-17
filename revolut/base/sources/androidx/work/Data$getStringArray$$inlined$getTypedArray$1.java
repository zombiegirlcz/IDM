package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "TArray", "", "i", "invoke", "(I)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class Data$getStringArray$$inlined$getTypedArray$1 extends u implements Function1<Integer, String> {
    final /* synthetic */ Object $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data$getStringArray$$inlined$getTypedArray$1(Object obj2) {
        super(1);
        this.$value = obj2;
    }

    public final String invoke(int i) {
        Object obj2 = ((Object[]) this.$value)[i];
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return invoke(((Number) obj2).intValue());
    }
}
