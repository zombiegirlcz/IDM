package com.revolut.core.ui_kit.delegates;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public abstract class gg {

    public static final class a extends gg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54220a = new a();

        private a() {
        }
    }

    public static final class b extends gg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f54221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f54222b;

        public b() {
            this(false, 3);
        }

        @Override // com.revolut.core.ui_kit.delegates.gg
        public final boolean a() {
            return this.f54221a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.f54221a == bVar.f54221a && Float.compare(this.f54222b, bVar.f54222b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f54222b) + (Boolean.hashCode(this.f54221a) * 31);
        }

        public b(boolean z, float f) {
            this.f54221a = z;
            this.f54222b = f;
        }

        public /* synthetic */ b(boolean z, int i) {
            this((i & 1) != 0 ? false : z, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public static final class c extends gg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54223a;

        public c() {
            this(0);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f54223a == ((c) obj2).f54223a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f54223a);
        }

        public c(int i) {
            this.f54223a = -1;
        }
    }

    private gg() {
    }

    public boolean a() {
        return false;
    }
}
