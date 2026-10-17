package fug;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f138204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f138205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f138206c;
    public final TextLocalisedClause d;
    public final CdnImage e;

    public a(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryButtonLabel, TextLocalisedClause secondaryButtonLabel, CdnImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
        Intrinsics.checkNotNullParameter(secondaryButtonLabel, "secondaryButtonLabel");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f138204a = title;
        this.f138205b = description;
        this.f138206c = primaryButtonLabel;
        this.d = secondaryButtonLabel;
        this.e = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f138204a.equals(aVar.f138204a) && this.f138205b.equals(aVar.f138205b) && this.f138206c.equals(aVar.f138206c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + t61.a.a(t61.a.a(t61.a.a(this.f138204a.hashCode() * 31, 31, this.f138205b), 31, this.f138206c), 31, this.d);
    }
}
