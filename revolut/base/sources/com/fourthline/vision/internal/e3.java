package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface e3 {

    public static final class b implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MrzInfo f36127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f36128b;

        public b(@NotNull MrzInfo mrz, @NotNull d textDetection) {
            Intrinsics.checkNotNullParameter(mrz, "mrz");
            Intrinsics.checkNotNullParameter(textDetection, "textDetection");
            this.f36127a = mrz;
            this.f36128b = textDetection;
        }

        public static /* synthetic */ b copy$default(b bVar, MrzInfo mrzInfo, d dVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                mrzInfo = bVar.f36127a;
            }
            if ((i & 2) != 0) {
                dVar = bVar.f36128b;
            }
            return bVar.copy(mrzInfo, dVar);
        }

        @NotNull
        public final MrzInfo component1() {
            return this.f36127a;
        }

        @NotNull
        public final d component2() {
            return this.f36128b;
        }

        @NotNull
        public final b copy(@NotNull MrzInfo mrz, @NotNull d textDetection) {
            Intrinsics.checkNotNullParameter(mrz, "mrz");
            Intrinsics.checkNotNullParameter(textDetection, "textDetection");
            return new b(mrz, textDetection);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f36127a, bVar.f36127a) && Intrinsics.f(this.f36128b, bVar.f36128b);
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public fa getBox() {
            return this.f36128b.getBox();
        }

        @NotNull
        public final MrzInfo getMrz() {
            return this.f36127a;
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public String getText() {
            return this.f36128b.getText();
        }

        @NotNull
        public final d getTextDetection() {
            return this.f36128b;
        }

        public int hashCode() {
            return (this.f36127a.hashCode() * 31) + this.f36128b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Mrz(mrz=" + this.f36127a + ", textDetection=" + this.f36128b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f36129a;

        public c(@NotNull List<d> texts) {
            Intrinsics.checkNotNullParameter(texts, "texts");
            this.f36129a = texts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = cVar.f36129a;
            }
            return cVar.copy(list);
        }

        @NotNull
        public final List<d> component1() {
            return this.f36129a;
        }

        @NotNull
        public final c copy(@NotNull List<d> texts) {
            Intrinsics.checkNotNullParameter(texts, "texts");
            return new c(texts);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f36129a, ((c) obj2).f36129a);
        }

        @NotNull
        public final List<d> getTexts() {
            return this.f36129a;
        }

        public int hashCode() {
            return this.f36129a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Root(texts=" + this.f36129a + ")";
        }
    }

    @NotNull
    fa getBox();

    @NotNull
    String getText();

    public static final class a implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final fa f36125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f36126c;

        public a(@NotNull String text, @NotNull fa box, List<Object> list) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(box, "box");
            this.f36124a = text;
            this.f36125b = box;
            this.f36126c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, String str, fa faVar, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = aVar.f36124a;
            }
            if ((i & 2) != 0) {
                faVar = aVar.f36125b;
            }
            if ((i & 4) != 0) {
                list = aVar.f36126c;
            }
            return aVar.copy(str, faVar, list);
        }

        @NotNull
        public final String component1() {
            return this.f36124a;
        }

        @NotNull
        public final fa component2() {
            return this.f36125b;
        }

        public final List<Object> component3() {
            return this.f36126c;
        }

        @NotNull
        public final a copy(@NotNull String text, @NotNull fa box, List<Object> list) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(box, "box");
            return new a(text, box, list);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f36124a, aVar.f36124a) && Intrinsics.f(this.f36125b, aVar.f36125b) && Intrinsics.f(this.f36126c, aVar.f36126c);
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public fa getBox() {
            return this.f36125b;
        }

        public final List<Object> getSymbols() {
            return this.f36126c;
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public String getText() {
            return this.f36124a;
        }

        public int hashCode() {
            int iHashCode = ((this.f36124a.hashCode() * 31) + this.f36125b.hashCode()) * 31;
            List list = this.f36126c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Line(text=" + this.f36124a + ", box=" + this.f36125b + ", symbols=" + this.f36126c + ")";
        }

        public /* synthetic */ a(String str, fa faVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, faVar, (i & 4) != 0 ? null : list);
        }
    }

    public static final class d implements e3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final fa f36131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f36132c;

        public d(@NotNull String text, @NotNull fa box, List<a> list) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(box, "box");
            this.f36130a = text;
            this.f36131b = box;
            this.f36132c = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d copy$default(d dVar, String str, fa faVar, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = dVar.f36130a;
            }
            if ((i & 2) != 0) {
                faVar = dVar.f36131b;
            }
            if ((i & 4) != 0) {
                list = dVar.f36132c;
            }
            return dVar.copy(str, faVar, list);
        }

        @NotNull
        public final String component1() {
            return this.f36130a;
        }

        @NotNull
        public final fa component2() {
            return this.f36131b;
        }

        public final List<a> component3() {
            return this.f36132c;
        }

        @NotNull
        public final d copy(@NotNull String text, @NotNull fa box, List<a> list) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(box, "box");
            return new d(text, box, list);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f36130a, dVar.f36130a) && Intrinsics.f(this.f36131b, dVar.f36131b) && Intrinsics.f(this.f36132c, dVar.f36132c);
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public fa getBox() {
            return this.f36131b;
        }

        public final List<a> getLines() {
            return this.f36132c;
        }

        @Override // com.fourthline.vision.internal.e3
        @NotNull
        public String getText() {
            return this.f36130a;
        }

        public int hashCode() {
            int iHashCode = ((this.f36130a.hashCode() * 31) + this.f36131b.hashCode()) * 31;
            List list = this.f36132c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Text(text=" + this.f36130a + ", box=" + this.f36131b + ", lines=" + this.f36132c + ")";
        }

        public /* synthetic */ d(String str, fa faVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, faVar, (i & 4) != 0 ? null : list);
        }
    }
}
