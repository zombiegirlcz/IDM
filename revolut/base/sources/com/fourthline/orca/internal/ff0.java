package com.fourthline.orca.internal;

import android.net.Uri;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ff0 extends ie1 {

    public static final class b implements ff0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c81 f28479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p70 f28480b;

        public b(c81 title, p70 lottieSource) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            this.f28479a = title;
            this.f28480b = lottieSource;
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 a() {
            wz.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        @Override // com.fourthline.orca.internal.ff0
        public z10 b() {
            wz.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f28479a, bVar.f28479a) && Intrinsics.f(this.f28480b, bVar.f28480b);
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 getTitle() {
            return this.f28479a;
        }

        public int hashCode() {
            return (this.f28479a.hashCode() * 31) + this.f28480b.hashCode();
        }

        @Override // com.fourthline.orca.internal.ff0
        public a m() {
            wz.a("Do not touch! Use `NfcScannerViewWithLoader` Composable.");
            throw new KotlinNothingValueException();
        }

        public final p70 n() {
            return this.f28480b;
        }

        public String toString() {
            return "LoadingState(title=" + this.f28479a + ", lottieSource=" + this.f28480b + ")";
        }
    }

    public static final class c implements ff0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f28481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f28482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f28483c;
        private final z10 d;
        private final df0 e;

        public c(a animation, c81 title, c81 description, z10 closeImageSource, df0 progressGraphic) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
            Intrinsics.checkNotNullParameter(progressGraphic, "progressGraphic");
            this.f28481a = animation;
            this.f28482b = title;
            this.f28483c = description;
            this.d = closeImageSource;
            this.e = progressGraphic;
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 a() {
            return this.f28483c;
        }

        @Override // com.fourthline.orca.internal.ff0
        public z10 b() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f28481a, cVar.f28481a) && Intrinsics.f(this.f28482b, cVar.f28482b) && Intrinsics.f(this.f28483c, cVar.f28483c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 getTitle() {
            return this.f28482b;
        }

        public int hashCode() {
            return (((((((this.f28481a.hashCode() * 31) + this.f28482b.hashCode()) * 31) + this.f28483c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        @Override // com.fourthline.orca.internal.ff0
        public a m() {
            return this.f28481a;
        }

        public final df0 n() {
            return this.e;
        }

        public String toString() {
            return "LookingForDocumentState(animation=" + this.f28481a + ", title=" + this.f28482b + ", description=" + this.f28483c + ", closeImageSource=" + this.d + ", progressGraphic=" + this.e + ")";
        }
    }

    public static final class d implements ff0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f28484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f28485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f28486c;
        private final z10 d;
        private final df0 e;

        public d(a animation, c81 title, c81 description, z10 closeImageSource, df0 progressGraphic) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
            Intrinsics.checkNotNullParameter(progressGraphic, "progressGraphic");
            this.f28484a = animation;
            this.f28485b = title;
            this.f28486c = description;
            this.d = closeImageSource;
            this.e = progressGraphic;
        }

        public final d a(a animation, c81 title, c81 description, z10 closeImageSource, df0 progressGraphic) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
            Intrinsics.checkNotNullParameter(progressGraphic, "progressGraphic");
            return new d(animation, title, description, closeImageSource, progressGraphic);
        }

        @Override // com.fourthline.orca.internal.ff0
        public z10 b() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f28484a, dVar.f28484a) && Intrinsics.f(this.f28485b, dVar.f28485b) && Intrinsics.f(this.f28486c, dVar.f28486c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 getTitle() {
            return this.f28485b;
        }

        public int hashCode() {
            return (((((((this.f28484a.hashCode() * 31) + this.f28485b.hashCode()) * 31) + this.f28486c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        @Override // com.fourthline.orca.internal.ff0
        public a m() {
            return this.f28484a;
        }

        public final df0 n() {
            return this.e;
        }

        public String toString() {
            return "ScanningState(animation=" + this.f28484a + ", title=" + this.f28485b + ", description=" + this.f28486c + ", closeImageSource=" + this.d + ", progressGraphic=" + this.e + ")";
        }

        public static /* synthetic */ d a(d dVar, a aVar, c81 c81Var, c81 c81Var2, z10 z10Var, df0 df0Var, int i, Object obj2) {
            if ((i & 1) != 0) {
                aVar = dVar.f28484a;
            }
            if ((i & 2) != 0) {
                c81Var = dVar.f28485b;
            }
            if ((i & 4) != 0) {
                c81Var2 = dVar.f28486c;
            }
            if ((i & 8) != 0) {
                z10Var = dVar.d;
            }
            if ((i & 16) != 0) {
                df0Var = dVar.e;
            }
            df0 df0Var2 = df0Var;
            c81 c81Var3 = c81Var2;
            return dVar.a(aVar, c81Var, c81Var3, z10Var, df0Var2);
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 a() {
            return this.f28486c;
        }
    }

    public static final class e implements ff0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f28487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f28488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f28489c;
        private final z10 d;
        private final z10 e;

        public e(a animation, c81 title, c81 description, z10 closeImageSource, z10 successImageSource) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
            Intrinsics.checkNotNullParameter(successImageSource, "successImageSource");
            this.f28487a = animation;
            this.f28488b = title;
            this.f28489c = description;
            this.d = closeImageSource;
            this.e = successImageSource;
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 a() {
            return this.f28489c;
        }

        @Override // com.fourthline.orca.internal.ff0
        public z10 b() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.f28487a, eVar.f28487a) && Intrinsics.f(this.f28488b, eVar.f28488b) && Intrinsics.f(this.f28489c, eVar.f28489c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
        }

        @Override // com.fourthline.orca.internal.ff0
        public c81 getTitle() {
            return this.f28488b;
        }

        public int hashCode() {
            return (((((((this.f28487a.hashCode() * 31) + this.f28488b.hashCode()) * 31) + this.f28489c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        }

        @Override // com.fourthline.orca.internal.ff0
        public a m() {
            return this.f28487a;
        }

        public final z10 n() {
            return this.e;
        }

        public String toString() {
            return "SuccessState(animation=" + this.f28487a + ", title=" + this.f28488b + ", description=" + this.f28489c + ", closeImageSource=" + this.d + ", successImageSource=" + this.e + ")";
        }
    }

    c81 a();

    z10 b();

    c81 getTitle();

    a m();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z00 f28474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pair f28475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f28476c;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ff0$a$a, reason: collision with other inner class name */
        public interface InterfaceC0196a extends z00 {

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ff0$a$a$a, reason: collision with other inner class name */
            public static final class C0197a implements InterfaceC0196a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Uri f28477a;

                public C0197a(Uri path) {
                    Intrinsics.checkNotNullParameter(path, "path");
                    this.f28477a = path;
                }

                public final Uri b() {
                    return this.f28477a;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof C0197a) && Intrinsics.f(this.f28477a, ((C0197a) obj2).f28477a);
                }

                public int hashCode() {
                    return this.f28477a.hashCode();
                }

                public String toString() {
                    return "FromLocalFile(path=" + this.f28477a + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.ff0$a$a$b */
            public static final class b implements InterfaceC0196a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f28478a;

                public b(int i) {
                    this.f28478a = i;
                }

                public final int b() {
                    return this.f28478a;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof b) && this.f28478a == ((b) obj2).f28478a;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f28478a);
                }

                public String toString() {
                    return "FromRawResource(videoRawResId=" + this.f28478a + ")";
                }
            }
        }

        public a(z00 animationSource, Pair keyFrameRange, boolean z) {
            Intrinsics.checkNotNullParameter(animationSource, "animationSource");
            Intrinsics.checkNotNullParameter(keyFrameRange, "keyFrameRange");
            this.f28474a = animationSource;
            this.f28475b = keyFrameRange;
            this.f28476c = z;
        }

        public final z00 a() {
            return this.f28474a;
        }

        public final Pair b() {
            return this.f28475b;
        }

        public final boolean c() {
            return this.f28476c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28474a, aVar.f28474a) && Intrinsics.f(this.f28475b, aVar.f28475b) && this.f28476c == aVar.f28476c;
        }

        public int hashCode() {
            return (((this.f28474a.hashCode() * 31) + this.f28475b.hashCode()) * 31) + Boolean.hashCode(this.f28476c);
        }

        public String toString() {
            return "AnimationState(animationSource=" + this.f28474a + ", keyFrameRange=" + this.f28475b + ", loop=" + this.f28476c + ")";
        }

        public /* synthetic */ a(z00 z00Var, Pair pair, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z00Var, pair, (i & 4) != 0 ? false : z);
        }
    }
}
