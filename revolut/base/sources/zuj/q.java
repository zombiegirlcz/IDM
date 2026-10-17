package zuj;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeRangeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f325504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeRangeClause f325505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f325506c;

    public q(TextClause title, TimeRangeClause description, UrlImage background) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f325504a = title;
        this.f325505b = description;
        this.f325506c = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f325504a.equals(qVar.f325504a) && this.f325505b.equals(qVar.f325505b) && this.f325506c.equals(qVar.f325506c);
    }

    public final int hashCode() {
        return this.f325506c.hashCode() + ((this.f325505b.hashCode() + (this.f325504a.hashCode() * 31)) * 31);
    }
}
