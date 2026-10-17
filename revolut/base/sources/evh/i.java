package evh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Levh/i$a;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "title", "c", "subtitle", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.hiddenDialog, aVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Levh/i$b;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "subtitle", "Levh/i$b$a;", "Levh/i$b$a;", "()Levh/i$b$a;", "structure", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("questionStructure")
        private final a structure;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Levh/i$b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "minFilesCount", "b", "maxFilesCount", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxFileSizeInBytes", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("minFilesCount")
            private final Integer minFilesCount;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("maxFilesCount")
            private final Integer maxFilesCount;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("maxFileSize")
            private final Long maxFileSizeInBytes;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Long getMaxFileSizeInBytes() {
                return this.maxFileSizeInBytes;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getMaxFilesCount() {
                return this.maxFilesCount;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Integer getMinFilesCount() {
                return this.minFilesCount;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.minFilesCount, aVar.minFilesCount) && Intrinsics.f(this.maxFilesCount, aVar.maxFilesCount) && Intrinsics.f(this.maxFileSizeInBytes, aVar.maxFileSizeInBytes);
            }

            public final int hashCode() {
                Integer num = this.minFilesCount;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.maxFilesCount;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Long l2 = this.maxFileSizeInBytes;
                return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getStructure() {
            return this.structure;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.subtitle, bVar.subtitle) && Intrinsics.f(this.structure, bVar.structure) && Intrinsics.f(this.hiddenDialog, bVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.structure;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Levh/i$c;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "title", "d", "subtitle", "", "Ljava/util/List;", "()Ljava/util/List;", "frequencies", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("frequencies")
        private final List<String> frequencies;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getFrequencies() {
            return this.frequencies;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subtitle, cVar.subtitle) && Intrinsics.f(this.frequencies, cVar.frequencies) && Intrinsics.f(this.hiddenDialog, cVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.frequencies;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Levh/i$d;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "subtitle", "", "Levh/i$f;", "Ljava/util/List;", "()Ljava/util/List;", "options", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("options")
        @NotNull
        private final List<f> options;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getOptions() {
            return this.options;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.subtitle, dVar.subtitle) && Intrinsics.f(this.options, dVar.options) && Intrinsics.f(this.hiddenDialog, dVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
            evh.g gVar = this.hiddenDialog;
            return iD + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Levh/i$e;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "subtitle", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "", "Levh/i$e$a;", "Ljava/util/List;", "()Ljava/util/List;", "items", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("texts")
        @NotNull
        private final List<a> items;

        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Levh/i$e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "placeholder", "c", "assistiveText", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxLength", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            private final String placeholder;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("assistiveText")
            private final String assistiveText;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("maxLength")
            private final Integer maxLength;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAssistiveText() {
                return this.assistiveText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Integer getMaxLength() {
                return this.maxLength;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.placeholder, aVar.placeholder) && Intrinsics.f(this.assistiveText, aVar.assistiveText) && Intrinsics.f(this.maxLength, aVar.maxLength);
            }

            public final int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.placeholder;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.assistiveText;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.maxLength;
                return iHashCode3 + (num != null ? num.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.subtitle, eVar.subtitle) && Intrinsics.f(this.hiddenDialog, eVar.hiddenDialog) && Intrinsics.f(this.items, eVar.items);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return this.items.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Levh/i$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "title", "subtitle", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.title, fVar.title) && Intrinsics.f(this.subtitle, fVar.subtitle);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Levh/i$g;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "subtitle", "", "Levh/i$f;", "Ljava/util/List;", "()Ljava/util/List;", "options", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("options")
        @NotNull
        private final List<f> options;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getOptions() {
            return this.options;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.subtitle, gVar.subtitle) && Intrinsics.f(this.options, gVar.options) && Intrinsics.f(this.hiddenDialog, gVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
            evh.g gVar = this.hiddenDialog;
            return iD + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Levh/i$h;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "g", "title", "f", "subtitle", "d", "e", "placeholder", "assistiveText", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxLength", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("placeholder")
        private final String placeholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("assistiveText")
        private final String assistiveText;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("maxLength")
        private final Integer maxLength;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssistiveText() {
            return this.assistiveText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getMaxLength() {
            return this.maxLength;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.title, hVar.title) && Intrinsics.f(this.subtitle, hVar.subtitle) && Intrinsics.f(this.placeholder, hVar.placeholder) && Intrinsics.f(this.assistiveText, hVar.assistiveText) && Intrinsics.f(this.maxLength, hVar.maxLength) && Intrinsics.f(this.hiddenDialog, hVar.hiddenDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placeholder;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.assistiveText;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.maxLength;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: evh.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Levh/i$i;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "h", "title", "c", "g", "subtitle", "Levh/g;", "d", "Levh/g;", "()Levh/g;", "hiddenDialog", "Levh/i$i$a;", "e", "Levh/i$i$a;", "()Levh/i$i$a;", "item", "f", "newItemLabel", "", "I", "()I", "maxItems", "", "Ljava/util/List;", "()Ljava/util/List;", "itemLabels", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0758i extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("item")
        @NotNull
        private final a item;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("newItemLabel")
        private final String newItemLabel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("maxItems")
        private final int maxItems;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("itemLabels")
        @NotNull
        private final List<String> itemLabels;

        /* JADX INFO: renamed from: evh.i$i$a */
        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0015"}, d2 = {"Levh/i$i$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "valuePlaceholder", "b", "e", "startDatePlaceholder", "c", "endDatePlaceholder", "d", "dateRangePrecision", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "minDate", "maxDate", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("valuePlaceholder")
            @NotNull
            private final String valuePlaceholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("startDatePlaceholder")
            @NotNull
            private final String startDatePlaceholder;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("endDatePlaceholder")
            @NotNull
            private final String endDatePlaceholder;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("dateRangePrecision")
            @NotNull
            private final String dateRangePrecision;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("minDate")
            private final Long minDate;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("maxDate")
            private final Long maxDate;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDateRangePrecision() {
                return this.dateRangePrecision;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getEndDatePlaceholder() {
                return this.endDatePlaceholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Long getMaxDate() {
                return this.maxDate;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Long getMinDate() {
                return this.minDate;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getStartDatePlaceholder() {
                return this.startDatePlaceholder;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.valuePlaceholder, aVar.valuePlaceholder) && Intrinsics.f(this.startDatePlaceholder, aVar.startDatePlaceholder) && Intrinsics.f(this.endDatePlaceholder, aVar.endDatePlaceholder) && Intrinsics.f(this.dateRangePrecision, aVar.dateRangePrecision) && Intrinsics.f(this.minDate, aVar.minDate) && Intrinsics.f(this.maxDate, aVar.maxDate);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getValuePlaceholder() {
                return this.valuePlaceholder;
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(p.a.c(this.valuePlaceholder.hashCode() * 31, 31, this.startDatePlaceholder), 31, this.endDatePlaceholder), 31, this.dateRangePrecision);
                Long l2 = this.minDate;
                int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
                Long l3 = this.maxDate;
                return iHashCode + (l3 != null ? l3.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getItemLabels() {
            return this.itemLabels;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMaxItems() {
            return this.maxItems;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0758i)) {
                return false;
            }
            C0758i c0758i = (C0758i) obj2;
            return Intrinsics.f(this.id, c0758i.id) && Intrinsics.f(this.title, c0758i.title) && Intrinsics.f(this.subtitle, c0758i.subtitle) && Intrinsics.f(this.hiddenDialog, c0758i.hiddenDialog) && Intrinsics.f(this.item, c0758i.item) && Intrinsics.f(this.newItemLabel, c0758i.newItemLabel) && this.maxItems == c0758i.maxItems && Intrinsics.f(this.itemLabels, c0758i.itemLabels);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getNewItemLabel() {
            return this.newItemLabel;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            int iHashCode2 = (this.item.hashCode() + ((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
            String str2 = this.newItemLabel;
            return this.itemLabels.hashCode() + j6.a.b(this.maxItems, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Levh/i$j;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "title", "c", "getSubtitle", "subtitle", "Levh/g;", "d", "Levh/g;", "getHiddenDialog", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.title, jVar.title) && Intrinsics.f(this.subtitle, jVar.subtitle) && Intrinsics.f(this.hiddenDialog, jVar.hiddenDialog);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            evh.g gVar = this.hiddenDialog;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"Levh/i$k;", "Levh/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "title", "c", "d", "subtitle", "f", "yesTitle", "noTitle", "Levh/g;", "Levh/g;", "()Levh/g;", "hiddenDialog", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("yesTitle")
        @NotNull
        private final String yesTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("noTitle")
        @NotNull
        private final String noTitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("hiddenDialog")
        private final evh.g hiddenDialog;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final evh.g getHiddenDialog() {
            return this.hiddenDialog;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNoTitle() {
            return this.noTitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.subtitle, kVar.subtitle) && Intrinsics.f(this.yesTitle, kVar.yesTitle) && Intrinsics.f(this.noTitle, kVar.noTitle) && Intrinsics.f(this.hiddenDialog, kVar.hiddenDialog);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getYesTitle() {
            return this.yesTitle;
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.yesTitle), 31, this.noTitle);
            evh.g gVar = this.hiddenDialog;
            return iC2 + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    private i() {
    }
}
