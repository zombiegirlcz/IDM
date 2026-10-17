package com.fourthline.orca.core.flavor;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "baseLanguage", "fixedLanguage", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "component2", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;)Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "getBaseLanguage", "b", "getFixedLanguage", "LanguageType", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrcaLocalization {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LanguageType baseLanguage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LanguageType fixedLanguage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "", "<init>", "(Ljava/lang/String;I)V", "", "a", "Ljava/lang/String;", "getLanguageCode$fourthline_sdk_release", "()Ljava/lang/String;", "languageCode", "EN", "NL", "EL", "ES", "FI", "FR", "IT", "DE", "PL", "PT", "RO", "HR", "MT", "ET", "TR", "BG", "NB", "DA", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LanguageType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ LanguageType[] f26625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f26626c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String languageCode;
        public static final LanguageType EN = new LanguageType("EN", 0);
        public static final LanguageType NL = new LanguageType("NL", 1);
        public static final LanguageType EL = new LanguageType("EL", 2);
        public static final LanguageType ES = new LanguageType("ES", 3);
        public static final LanguageType FI = new LanguageType("FI", 4);
        public static final LanguageType FR = new LanguageType("FR", 5);
        public static final LanguageType IT = new LanguageType("IT", 6);
        public static final LanguageType DE = new LanguageType("DE", 7);
        public static final LanguageType PL = new LanguageType("PL", 8);
        public static final LanguageType PT = new LanguageType("PT", 9);
        public static final LanguageType RO = new LanguageType("RO", 10);
        public static final LanguageType HR = new LanguageType("HR", 11);
        public static final LanguageType MT = new LanguageType("MT", 12);
        public static final LanguageType ET = new LanguageType("ET", 13);
        public static final LanguageType TR = new LanguageType("TR", 14);
        public static final LanguageType BG = new LanguageType("BG", 15);
        public static final LanguageType NB = new LanguageType("NB", 16);
        public static final LanguageType DA = new LanguageType("DA", 17);

        static {
            LanguageType[] languageTypeArrA = a();
            f26625b = languageTypeArrA;
            f26626c = s.n(languageTypeArrA);
        }

        private LanguageType(String str, int i) {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.languageCode = lowerCase;
        }

        private static final /* synthetic */ LanguageType[] a() {
            return new LanguageType[]{EN, NL, EL, ES, FI, FR, IT, DE, PL, PT, RO, HR, MT, ET, TR, BG, NB, DA};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f26626c;
        }

        public static LanguageType valueOf(String str) {
            return (LanguageType) Enum.valueOf(LanguageType.class, str);
        }

        public static LanguageType[] values() {
            return (LanguageType[]) f26625b.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getLanguageCode$fourthline_sdk_release, reason: from getter */
        public final String getLanguageCode() {
            return this.languageCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrcaLocalization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrcaLocalization copy$default(OrcaLocalization orcaLocalization, LanguageType languageType, LanguageType languageType2, int i, Object obj2) {
        if ((i & 1) != 0) {
            languageType = orcaLocalization.baseLanguage;
        }
        if ((i & 2) != 0) {
            languageType2 = orcaLocalization.fixedLanguage;
        }
        return orcaLocalization.copy(languageType, languageType2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LanguageType getBaseLanguage() {
        return this.baseLanguage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LanguageType getFixedLanguage() {
        return this.fixedLanguage;
    }

    @NotNull
    public final OrcaLocalization copy(@NotNull LanguageType baseLanguage, LanguageType fixedLanguage) {
        Intrinsics.checkNotNullParameter(baseLanguage, "baseLanguage");
        return new OrcaLocalization(baseLanguage, fixedLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaLocalization)) {
            return false;
        }
        OrcaLocalization orcaLocalization = (OrcaLocalization) other;
        return this.baseLanguage == orcaLocalization.baseLanguage && this.fixedLanguage == orcaLocalization.fixedLanguage;
    }

    @NotNull
    public final LanguageType getBaseLanguage() {
        return this.baseLanguage;
    }

    public final LanguageType getFixedLanguage() {
        return this.fixedLanguage;
    }

    public int hashCode() {
        int iHashCode = this.baseLanguage.hashCode() * 31;
        LanguageType languageType = this.fixedLanguage;
        return iHashCode + (languageType == null ? 0 : languageType.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrcaLocalization(baseLanguage=" + this.baseLanguage + ", fixedLanguage=" + this.fixedLanguage + ")";
    }

    public OrcaLocalization(@NotNull LanguageType baseLanguage, LanguageType languageType) {
        Intrinsics.checkNotNullParameter(baseLanguage, "baseLanguage");
        this.baseLanguage = baseLanguage;
        this.fixedLanguage = languageType;
    }

    public /* synthetic */ OrcaLocalization(LanguageType languageType, LanguageType languageType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LanguageType.EN : languageType, (i & 2) != 0 ? null : languageType2);
    }
}
