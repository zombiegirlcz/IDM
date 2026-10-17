package aq0;

import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileDelegate;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileLoadingDelegate;
import java.util.List;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8217a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PersonalisationGalleryTileDelegate f8218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final List f8219c;

        static {
            PersonalisationGalleryTileDelegate personalisationGalleryTileDelegate = new PersonalisationGalleryTileDelegate();
            f8218b = personalisationGalleryTileDelegate;
            f8219c = v.k(personalisationGalleryTileDelegate, new PersonalisationGalleryTileLoadingDelegate());
        }

        private a() {
        }

        @Override // aq0.f
        public final List a() {
            return f8219c;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public final int hashCode() {
            return 1598287685;
        }
    }

    private f() {
    }

    public abstract List a();
}
