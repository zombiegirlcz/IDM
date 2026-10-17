package bq7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17775a = new a();

        private a() {
        }

        @Override // bq7.e
        public final boolean a() {
            return false;
        }

        @Override // bq7.e
        public final Image b() {
            return null;
        }

        @Override // bq7.e
        public final Clause c() {
            return null;
        }

        @Override // bq7.e
        public final boolean d() {
            return false;
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17776a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AnimatedResourceImage f17777b = new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 8, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite));

        private b() {
        }

        @Override // bq7.e
        public final boolean a() {
            return false;
        }

        @Override // bq7.e
        public final Image b() {
            return f17777b;
        }

        @Override // bq7.e
        public final Clause c() {
            return null;
        }

        @Override // bq7.e
        public final boolean d() {
            return true;
        }
    }

    private e() {
    }

    public abstract boolean a();

    public abstract Image b();

    public abstract Clause c();

    public abstract boolean d();
}
