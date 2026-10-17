package bai;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f14106c;
    public final Clause d;
    public final Image e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14107g;

    public m(List items, boolean z, TextLocalisedClause navBarTitleText, TextClause textClause, UrlImage urlImage, TextLocalisedClause mainButtonText, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitleText, "navBarTitleText");
        Intrinsics.checkNotNullParameter(mainButtonText, "mainButtonText");
        this.f14104a = items;
        this.f14105b = z;
        this.f14106c = navBarTitleText;
        this.d = textClause;
        this.e = urlImage;
        this.f = mainButtonText;
        this.f14107g = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f14104a;
    }
}
