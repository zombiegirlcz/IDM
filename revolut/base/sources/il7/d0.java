package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final no3.b f162098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162099c;
    public final String d;

    public /* synthetic */ d0(int i, String str, String str2, String str3, no3.b bVar) {
        if (15 != (i & 15)) {
            j1.f(b0.f162092a.getDescriptor(), i, 15);
            throw null;
        }
        this.f162097a = str;
        this.f162098b = bVar;
        this.f162099c = str2;
        this.d = str3;
    }

    public d0(String activateBy, String str, String str2, no3.b deliveryAddress) {
        Intrinsics.checkNotNullParameter(activateBy, "activateBy");
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        this.f162097a = activateBy;
        this.f162098b = deliveryAddress;
        this.f162099c = str;
        this.d = str2;
    }
}
