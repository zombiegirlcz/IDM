package cqi;

import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f108133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HtmlClause f108134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f108135c;
    public final Image d;
    public final PromptScreen e;

    public e(TextClause title, HtmlClause description, ResourceImage closeButtonImage, Image contentImage, PromptScreen promptScreen) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        Intrinsics.checkNotNullParameter(contentImage, "contentImage");
        this.f108133a = title;
        this.f108134b = description;
        this.f108135c = closeButtonImage;
        this.d = contentImage;
        this.e = promptScreen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f108133a.equals(eVar.f108133a) && this.f108134b.equals(eVar.f108134b) && this.f108135c.equals(eVar.f108135c) && this.d.equals(eVar.d) && this.e.equals(eVar.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() + a10.b.c(this.d, org.bouncycastle.jcajce.provider.digest.a.b(this.f108135c, (this.f108134b.hashCode() + (this.f108133a.hashCode() * 31)) * 961, 31), 961)) * 31;
    }
}
