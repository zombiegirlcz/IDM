package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ag extends ie1 {

    public static final class a implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f26786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f26787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p70 f26788c;
        private final z10 d;

        public a(c81 title, c81 description, p70 mainAnimation, z10 successIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(mainAnimation, "mainAnimation");
            Intrinsics.checkNotNullParameter(successIcon, "successIcon");
            this.f26786a = title;
            this.f26787b = description;
            this.f26788c = mainAnimation;
            this.d = successIcon;
        }

        @Override // com.fourthline.orca.internal.ag
        public c81 a() {
            return this.f26787b;
        }

        @Override // com.fourthline.orca.internal.ag
        public p70 d() {
            return this.f26788c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f26786a, aVar.f26786a) && Intrinsics.f(this.f26787b, aVar.f26787b) && Intrinsics.f(this.f26788c, aVar.f26788c) && Intrinsics.f(this.d, aVar.d);
        }

        @Override // com.fourthline.orca.internal.ag
        public c81 getTitle() {
            return this.f26786a;
        }

        public int hashCode() {
            return (((((this.f26786a.hashCode() * 31) + this.f26787b.hashCode()) * 31) + this.f26788c.hashCode()) * 31) + this.d.hashCode();
        }

        public final z10 n() {
            return this.d;
        }

        public String toString() {
            return "DoneState(title=" + this.f26786a + ", description=" + this.f26787b + ", mainAnimation=" + this.f26788c + ", successIcon=" + this.d + ")";
        }
    }

    public static final class b implements ag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f26789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f26790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p70 f26791c;
        private final p70 d;

        public b(c81 title, c81 description, p70 mainAnimation, p70 loadingAnimation) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(mainAnimation, "mainAnimation");
            Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
            this.f26789a = title;
            this.f26790b = description;
            this.f26791c = mainAnimation;
            this.d = loadingAnimation;
        }

        public final b a(c81 title, c81 description, p70 mainAnimation, p70 loadingAnimation) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(mainAnimation, "mainAnimation");
            Intrinsics.checkNotNullParameter(loadingAnimation, "loadingAnimation");
            return new b(title, description, mainAnimation, loadingAnimation);
        }

        @Override // com.fourthline.orca.internal.ag
        public p70 d() {
            return this.f26791c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f26789a, bVar.f26789a) && Intrinsics.f(this.f26790b, bVar.f26790b) && Intrinsics.f(this.f26791c, bVar.f26791c) && Intrinsics.f(this.d, bVar.d);
        }

        @Override // com.fourthline.orca.internal.ag
        public c81 getTitle() {
            return this.f26789a;
        }

        public int hashCode() {
            return (((((this.f26789a.hashCode() * 31) + this.f26790b.hashCode()) * 31) + this.f26791c.hashCode()) * 31) + this.d.hashCode();
        }

        public final p70 n() {
            return this.d;
        }

        public String toString() {
            return "LoadingState(title=" + this.f26789a + ", description=" + this.f26790b + ", mainAnimation=" + this.f26791c + ", loadingAnimation=" + this.d + ")";
        }

        public static /* synthetic */ b a(b bVar, c81 c81Var, c81 c81Var2, p70 p70Var, p70 p70Var2, int i, Object obj2) {
            if ((i & 1) != 0) {
                c81Var = bVar.f26789a;
            }
            if ((i & 2) != 0) {
                c81Var2 = bVar.f26790b;
            }
            if ((i & 4) != 0) {
                p70Var = bVar.f26791c;
            }
            if ((i & 8) != 0) {
                p70Var2 = bVar.d;
            }
            return bVar.a(c81Var, c81Var2, p70Var, p70Var2);
        }

        @Override // com.fourthline.orca.internal.ag
        public c81 a() {
            return this.f26790b;
        }
    }

    c81 a();

    p70 d();

    c81 getTitle();
}
