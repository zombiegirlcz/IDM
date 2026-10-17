package com.onfido.api.client.data;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u000f\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lcom/onfido/api/client/data/DocType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "PASSPORT", "DRIVING_LICENSE", "NATIONAL_ID_CARD", "VISA", "WORK_PERMIT", "RESIDENCE_PERMIT", "PASSPORT_CARD", "UNKNOWN", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final class DocType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocType[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String id;
    public static final DocType PASSPORT = new DocType("PASSPORT", 0, "passport");
    public static final DocType DRIVING_LICENSE = new DocType("DRIVING_LICENSE", 1, "driving_licence");
    public static final DocType NATIONAL_ID_CARD = new DocType("NATIONAL_ID_CARD", 2, "national_identity_card");
    public static final DocType VISA = new DocType("VISA", 3, "visa");
    public static final DocType WORK_PERMIT = new DocType("WORK_PERMIT", 4, "work_permit");
    public static final DocType RESIDENCE_PERMIT = new DocType("RESIDENCE_PERMIT", 5, "residence_permit");
    public static final DocType PASSPORT_CARD = new DocType("PASSPORT_CARD", 6, "passport_card");
    public static final DocType UNKNOWN = new DocType("UNKNOWN", 7, "unknown");

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DocType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DocType;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.onfido.api.client.data.DocType$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends u implements Function0<KSerializer> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KSerializer invoke() {
                return DocType$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) DocType.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ DocType[] $values() {
        return new DocType[]{PASSPORT, DRIVING_LICENSE, NATIONAL_ID_CARD, VISA, WORK_PERMIT, RESIDENCE_PERMIT, PASSPORT_CARD, UNKNOWN};
    }

    static {
        DocType[] docTypeArr$values = $values();
        $VALUES = docTypeArr$values;
        $ENTRIES = s.n(docTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }

    private DocType(String str, int i, String str2) {
        this.id = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DocType valueOf(String str) {
        return (DocType) Enum.valueOf(DocType.class, str);
    }

    public static DocType[] values() {
        return (DocType[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
