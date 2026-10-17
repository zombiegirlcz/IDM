package rd7;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f253369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f253370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f253371c;

    public j(List images, Integer num, c captionMode) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(captionMode, "captionMode");
        this.f253369a = images;
        this.f253370b = num;
        this.f253371c = captionMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f253369a, jVar.f253369a) && Intrinsics.f(this.f253370b, jVar.f253370b) && this.f253371c == jVar.f253371c;
    }

    public final int hashCode() {
        int iHashCode = this.f253369a.hashCode() * 31;
        Integer num = this.f253370b;
        return this.f253371c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public /* synthetic */ j(List list, Integer num, int i) {
        this(list, (i & 2) != 0 ? null : num, c.READ_ONLY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(List imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        List list = imageUrls;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            UrlImage.SimpleCustomHeaders simpleCustomHeaders = null;
            Object[] objArr = 0;
            if (it8.hasNext()) {
                arrayList.add(new g((String) it8.next(), simpleCustomHeaders, 14));
            } else {
                this((List) arrayList, (Integer) (objArr == true ? 1 : 0), 6);
                return;
            }
        }
    }
}
