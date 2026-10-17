package cz5;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f110162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f110163b;

    public b(Map providersByClass, Map providersByKind, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(providersByClass, "providersByClass");
                Intrinsics.checkNotNullParameter(providersByKind, "providersByKind");
                this.f110162a = providersByClass;
                this.f110163b = providersByKind;
                break;
            default:
                Intrinsics.checkNotNullParameter(providersByClass, "currencyPairConfigsById");
                Intrinsics.checkNotNullParameter(providersByKind, "currencyPairConfigsByCurrencyPairTypeIndex");
                this.f110162a = providersByClass;
                this.f110163b = providersByKind;
                break;
        }
    }

    public ky1.a a(Class contactClass) {
        Intrinsics.checkNotNullParameter(contactClass, "contactClass");
        Object obj2 = this.f110162a.get(contactClass);
        if (obj2 instanceof ky1.a) {
            return (ky1.a) obj2;
        }
        return null;
    }

    public ky1.a b(n02.b kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return (ky1.a) this.f110163b.get(kind);
    }
}
