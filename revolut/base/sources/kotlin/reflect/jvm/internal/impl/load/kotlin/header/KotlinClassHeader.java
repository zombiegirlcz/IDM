package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.f0;
import zhm.p;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kind f187105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MetadataVersion f187106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f187107c;
    public final String[] d;
    public final String[] e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f187108g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Kind[] $VALUES;
        public static final Kind CLASS;

        @NotNull
        public static final Companion Companion;
        public static final Kind FILE_FACADE;
        public static final Kind MULTIFILE_CLASS;
        public static final Kind MULTIFILE_CLASS_PART;
        public static final Kind SYNTHETIC_CLASS;
        public static final Kind UNKNOWN;

        @NotNull
        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f187109id;

        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            @NotNull
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        static {
            Kind kind = new Kind("UNKNOWN", 0, 0);
            UNKNOWN = kind;
            Kind kind2 = new Kind("CLASS", 1, 1);
            CLASS = kind2;
            Kind kind3 = new Kind("FILE_FACADE", 2, 2);
            FILE_FACADE = kind3;
            Kind kind4 = new Kind("SYNTHETIC_CLASS", 3, 3);
            SYNTHETIC_CLASS = kind4;
            Kind kind5 = new Kind("MULTIFILE_CLASS", 4, 4);
            MULTIFILE_CLASS = kind5;
            Kind kind6 = new Kind("MULTIFILE_CLASS_PART", 5, 5);
            MULTIFILE_CLASS_PART = kind6;
            Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6};
            $VALUES = kindArr;
            $ENTRIES = s.n(kindArr);
            Companion = new Companion(null);
            Kind[] kindArrValues = values();
            int iB = q0.b(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
            for (Kind kind7 : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind7.f187109id), kind7);
            }
            entryById = linkedHashMap;
        }

        public Kind(String str, int i, int i2) {
            this.f187109id = i2;
        }

        @NotNull
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) $VALUES.clone();
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull MetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f187105a = kind;
        this.f187106b = metadataVersion;
        this.f187107c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.f187108g = i;
    }

    public final String[] getData() {
        return this.f187107c;
    }

    public final String[] getIncompatibleData() {
        return this.d;
    }

    @NotNull
    public final Kind getKind() {
        return this.f187105a;
    }

    @NotNull
    public final MetadataVersion getMetadataVersion() {
        return this.f187106b;
    }

    public final String getMultifileClassName() {
        if (this.f187105a == Kind.MULTIFILE_CLASS_PART) {
            return this.f;
        }
        return null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.f187105a == Kind.MULTIFILE_CLASS ? this.f187107c : null;
        List<String> listC = strArr != null ? p.c(strArr) : null;
        return listC == null ? f0.f322471a : listC;
    }

    public final String[] getStrings() {
        return this.e;
    }

    public final boolean isPreRelease() {
        return (this.f187108g & 2) != 0;
    }

    public final boolean isUnstableJvmIrBinary() {
        int i = this.f187108g;
        return (i & 16) != 0 && (i & 32) == 0;
    }

    @NotNull
    public String toString() {
        return this.f187105a + " version=" + this.f187106b;
    }
}
