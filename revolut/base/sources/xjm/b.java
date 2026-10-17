package xjm;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f306586b = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306587a;

    public /* synthetic */ b(int i) {
        this.f306587a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f306587a) {
            case 0:
                return Boolean.FALSE;
            default:
                return new Pair((CallableDescriptor) obj2, (CallableDescriptor) obj3);
        }
    }
}
