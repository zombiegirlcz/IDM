package hpi;

import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f154548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f154549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f154550c;
    public LargeActionButton.ButtonStyle.DefaultFilledButton d;
    public boolean e;
    public xpi.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public wpi.d f154551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vpi.d f154552h;
    public iqi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jqi.d f154553j;
    public g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f154554l;

    public c(l rootContainerConfiguration) {
        Intrinsics.checkNotNullParameter(rootContainerConfiguration, "rootContainerConfiguration");
        this.f154548a = rootContainerConfiguration;
        this.d = LargeActionButton.ButtonStyle.f58725a;
    }

    public static void b(c cVar) {
        LargeActionButton.ButtonStyle.DefaultFilledButton buttonStyle = LargeActionButton.ButtonStyle.f58725a;
        Intrinsics.checkNotNullParameter("", "initialText");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        cVar.f154550c = "";
        cVar.d = buttonStyle;
    }

    public static void c(c cVar) {
        j configuration = new j(0);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f154549b = configuration;
    }

    public l a() {
        return this.f154548a;
    }
}
