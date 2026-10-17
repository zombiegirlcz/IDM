package l8e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f192965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f192966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f192967c;
    public final List d;

    public h(TextLocalisedClause title, TextLocalisedClause description, Image image, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f192965a = title;
        this.f192966b = description;
        this.f192967c = image;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f192965a.equals(hVar.f192965a) && this.f192966b.equals(hVar.f192966b) && this.f192967c.equals(hVar.f192967c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a10.b.c(this.f192967c, t61.a.a(this.f192965a.hashCode() * 31, 31, this.f192966b), 31);
    }
}
