package um2;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$Page;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$SandboxAppearance;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f281178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThemeCustomisationContract$Page f281179c;
    public final List d;
    public final boolean e;
    public final ThemedBackgroundKey f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnimationRequest f281180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ThemeCustomisationContract$SandboxAppearance f281181h;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public static a a(a aVar, Data data, Data data2, ThemeCustomisationContract$Page themeCustomisationContract$Page, List list, boolean z, ThemedBackgroundKey themedBackgroundKey, AnimationRequest animationRequest, ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance, int i) {
        if ((i & 1) != 0) {
            data = aVar.f281177a;
        }
        Data productsInfo = data;
        if ((i & 2) != 0) {
            data2 = aVar.f281178b;
        }
        Data themeInfo = data2;
        if ((i & 4) != 0) {
            themeCustomisationContract$Page = aVar.f281179c;
        }
        ThemeCustomisationContract$Page themeCustomisationContract$Page2 = themeCustomisationContract$Page;
        if ((i & 8) != 0) {
            list = aVar.d;
        }
        List availablePages = list;
        if ((i & 16) != 0) {
            z = aVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            themedBackgroundKey = aVar.f;
        }
        ThemedBackgroundKey themedBackgroundKey2 = themedBackgroundKey;
        AnimationRequest iconSelectorPreselectionAnimationRequest = (i & 64) != 0 ? aVar.f281180g : animationRequest;
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance2 = (i & 128) != 0 ? aVar.f281181h : themeCustomisationContract$SandboxAppearance;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(productsInfo, "productsInfo");
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        Intrinsics.checkNotNullParameter(availablePages, "availablePages");
        Intrinsics.checkNotNullParameter(iconSelectorPreselectionAnimationRequest, "iconSelectorPreselectionAnimationRequest");
        return new a(productsInfo, themeInfo, themeCustomisationContract$Page2, availablePages, z3, themedBackgroundKey2, iconSelectorPreselectionAnimationRequest, themeCustomisationContract$SandboxAppearance2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281177a, aVar.f281177a) && Intrinsics.f(this.f281178b, aVar.f281178b) && this.f281179c == aVar.f281179c && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f281180g, aVar.f281180g) && Intrinsics.f(this.f281181h, aVar.f281181h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f281178b, this.f281177a.hashCode() * 31, 31);
        ThemeCustomisationContract$Page themeCustomisationContract$Page = this.f281179c;
        int iC2 = j6.a.c(p.a.d((iC + (themeCustomisationContract$Page == null ? 0 : themeCustomisationContract$Page.hashCode())) * 31, 31, this.d), 31, this.e);
        ThemedBackgroundKey themedBackgroundKey = this.f;
        int iHashCode = (this.f281180g.hashCode() + ((iC2 + (themedBackgroundKey == null ? 0 : themedBackgroundKey.hashCode())) * 31)) * 31;
        ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance = this.f281181h;
        return iHashCode + (themeCustomisationContract$SandboxAppearance != null ? themeCustomisationContract$SandboxAppearance.hashCode() : 0);
    }

    public a(Data productsInfo, Data themeInfo, ThemeCustomisationContract$Page themeCustomisationContract$Page, List availablePages, boolean z, ThemedBackgroundKey themedBackgroundKey, AnimationRequest iconSelectorPreselectionAnimationRequest, ThemeCustomisationContract$SandboxAppearance themeCustomisationContract$SandboxAppearance) {
        Intrinsics.checkNotNullParameter(productsInfo, "productsInfo");
        Intrinsics.checkNotNullParameter(themeInfo, "themeInfo");
        Intrinsics.checkNotNullParameter(availablePages, "availablePages");
        Intrinsics.checkNotNullParameter(iconSelectorPreselectionAnimationRequest, "iconSelectorPreselectionAnimationRequest");
        this.f281177a = productsInfo;
        this.f281178b = themeInfo;
        this.f281179c = themeCustomisationContract$Page;
        this.d = availablePages;
        this.e = z;
        this.f = themedBackgroundKey;
        this.f281180g = iconSelectorPreselectionAnimationRequest;
        this.f281181h = themeCustomisationContract$SandboxAppearance;
    }

    public /* synthetic */ a(Data data, ThemeCustomisationContract$Page themeCustomisationContract$Page, ThemedBackgroundKey themedBackgroundKey, int i) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? new Data(null, null, true, 3, null) : data, (i & 4) != 0 ? null : themeCustomisationContract$Page, ThemeCustomisationContract$Page.b(), false, (i & 32) != 0 ? null : themedBackgroundKey, new AnimationRequest(false), null);
    }
}
