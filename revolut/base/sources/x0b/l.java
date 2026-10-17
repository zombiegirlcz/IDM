package x0b;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f301560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f301561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f301562c;
    public final Object d;
    public final Object e;

    public l(c90.c uiResources, f01.a uiKitResources, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f301560a = uiResources;
        this.f301561b = uiKitResources;
        this.f301562c = uriHelper;
        final int i = 0;
        this.d = w.y0(new Function0(this) { // from class: x0b.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f301558b;

            {
                this.f301558b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$attr.uikit_colorGroupedBackground;
                        l lVar = this.f301558b;
                        return new d1b.a(lVar.a(i2), lVar.a(R$attr.uikit_colorGreyTone50), lVar.a(R$attr.uikit_colorGreyTone8), lVar.a(R$attr.uikit_colorPerformancePositive), lVar.a(R$attr.uikit_colorPerformanceNegative), lVar.a(R$attr.uikit_colorGreyTone50), lVar.a(R$attr.uikit_colorGreyTone8), lVar.a(R$attr.uikit_colorPopoverBackground), lVar.a(R$attr.uikit_colorForeground));
                    default:
                        int i3 = R$attr.uikit_colorGroupedBackground;
                        l lVar2 = this.f301558b;
                        return new d1b.a(lVar2.a(i3), lVar2.a(R$attr.uikit_colorGreyTone50), lVar2.a(R$attr.uikit_colorGreyTone8), lVar2.a(R$attr.uikit_colorPerformancePositive), lVar2.a(R$attr.uikit_colorPerformanceNegative), lVar2.a(R$attr.uikit_colorGreyTone50), lVar2.a(R$attr.uikit_colorGreyTone8), lVar2.a(R$attr.uikit_colorPopoverBackground), lVar2.a(R$attr.uikit_colorForeground));
                }
            }
        });
        final int i2 = 1;
        this.e = w.y0(new Function0(this) { // from class: x0b.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f301558b;

            {
                this.f301558b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$attr.uikit_colorGroupedBackground;
                        l lVar = this.f301558b;
                        return new d1b.a(lVar.a(i22), lVar.a(R$attr.uikit_colorGreyTone50), lVar.a(R$attr.uikit_colorGreyTone8), lVar.a(R$attr.uikit_colorPerformancePositive), lVar.a(R$attr.uikit_colorPerformanceNegative), lVar.a(R$attr.uikit_colorGreyTone50), lVar.a(R$attr.uikit_colorGreyTone8), lVar.a(R$attr.uikit_colorPopoverBackground), lVar.a(R$attr.uikit_colorForeground));
                    default:
                        int i3 = R$attr.uikit_colorGroupedBackground;
                        l lVar2 = this.f301558b;
                        return new d1b.a(lVar2.a(i3), lVar2.a(R$attr.uikit_colorGreyTone50), lVar2.a(R$attr.uikit_colorGreyTone8), lVar2.a(R$attr.uikit_colorPerformancePositive), lVar2.a(R$attr.uikit_colorPerformanceNegative), lVar2.a(R$attr.uikit_colorGreyTone50), lVar2.a(R$attr.uikit_colorGreyTone8), lVar2.a(R$attr.uikit_colorPopoverBackground), lVar2.a(R$attr.uikit_colorForeground));
                }
            }
        });
    }

    public final String a(int i) {
        int iS = kli.a.s(i, this.f301560a.f22265a);
        int i2 = iS & 255;
        double d = ((double) ((iS >>> 24) & 255)) / 255.0d;
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("rgba(", (iS >>> 16) & 255, (iS >>> 8) & 255, ", ", ", ");
        sbW.append(i2);
        sbW.append(", ");
        sbW.append(d);
        sbW.append(")");
        return sbW.toString();
    }
}
