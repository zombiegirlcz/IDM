package a35;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f1068b;

    public /* synthetic */ o(Class cls, int i) {
        this.f1067a = i;
        this.f1068b = cls;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1067a) {
            case 0:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new Pair(this.f1068b, bool);
            case 1:
                Class cls = this.f1068b;
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                try {
                    return cls.getDeclaredField(it8);
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return Boolean.valueOf(this.f1068b.isInstance(obj2));
        }
    }
}
