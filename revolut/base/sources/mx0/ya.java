package mx0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ya implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f210129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb f210130c;

    public ya(String listId, Image image, bb imageSize) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        this.f210128a = listId;
        this.f210129b = image;
        this.f210130c = imageSize;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59236a() {
        return this.f210128a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj2;
        return Intrinsics.f(this.f210128a, yaVar.f210128a) && Intrinsics.f(this.f210129b, yaVar.f210129b) && this.f210130c == yaVar.f210130c;
    }

    public final int hashCode() {
        int iHashCode = this.f210128a.hashCode() * 31;
        Image image = this.f210129b;
        return (this.f210130c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        ya yaVar = oldItem instanceof ya ? (ya) oldItem : null;
        if (yaVar != null) {
            return new za(!Intrinsics.f(yaVar.f210129b, this.f210129b), yaVar.f210130c != this.f210130c);
        }
        return null;
    }
}
