package mx4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f210166a = new c();

        private c() {
        }

        @Override // mx4.b
        public final boolean a() {
            return true;
        }

        @Override // mx4.b
        public final RowDelegate.Model.c b() {
            return new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246)));
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public final int hashCode() {
            return 2056404522;
        }
    }

    private b() {
    }

    public abstract boolean a();

    public abstract RowDelegate.Model.c b();

    /* JADX INFO: renamed from: mx4.b$b, reason: collision with other inner class name */
    public static final class C1184b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f210165a;

        public C1184b(boolean z) {
            this.f210165a = z;
        }

        @Override // mx4.b
        public final boolean a() {
            return this.f210165a;
        }

        @Override // mx4.b
        public final /* bridge */ /* synthetic */ RowDelegate.Model.c b() {
            return null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1184b) && this.f210165a == ((C1184b) obj2).f210165a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f210165a);
        }

        public C1184b() {
            this(false);
        }
    }
}
