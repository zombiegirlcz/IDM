package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1m.b;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCardJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "nullableICChipReaderJapanCTResidenceCardAddressAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTSubmitDocumentRequestResidenceCardJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;
    private volatile Constructor<ICChipReaderJapanCTSubmitDocumentRequestResidenceCard> constructorRef;

    @NotNull
    private final l nullableICChipReaderJapanCTResidenceCardAddressAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTSubmitDocumentRequestResidenceCardJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"version", "address", "comprehensive_permission", "individual_permission", "update_status", "photo", "front"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "version");
        this.nullableICChipReaderJapanCTResidenceCardAddressAdapter = n.a(moshi, ICChipReaderJapanCTResidenceCardAddress.class, "address");
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "updateStatus");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Boolean bool;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        String str = null;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = null;
        String str2 = null;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            String str6 = str;
            ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress2 = iCChipReaderJapanCTResidenceCardAddress;
            String str7 = str2;
            if (!reader.i()) {
                String str8 = str3;
                reader.h();
                if (i == -3) {
                    if (str6 == null) {
                        JsonDataException jsonDataExceptionE = b.e("version", "version", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                        throw jsonDataExceptionE;
                    }
                    if (str7 == null) {
                        JsonDataException jsonDataExceptionE2 = b.e("comprehensivePermission", "comprehensive_permission", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                        throw jsonDataExceptionE2;
                    }
                    if (str8 == null) {
                        JsonDataException jsonDataExceptionE3 = b.e("individualPermission", "individual_permission", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                        throw jsonDataExceptionE3;
                    }
                    if (bool2 == null) {
                        JsonDataException jsonDataExceptionE4 = b.e("updateStatus", "update_status", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
                        throw jsonDataExceptionE4;
                    }
                    String str9 = str5;
                    String str10 = str4;
                    boolean zBooleanValue = bool2.booleanValue();
                    if (str10 == null) {
                        JsonDataException jsonDataExceptionE5 = b.e("photo", "photo", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
                        throw jsonDataExceptionE5;
                    }
                    if (str9 != null) {
                        return new ICChipReaderJapanCTSubmitDocumentRequestResidenceCard(str6, iCChipReaderJapanCTResidenceCardAddress2, str7, str8, zBooleanValue, str10, str9);
                    }
                    JsonDataException jsonDataExceptionE6 = b.e("front", "front", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
                    throw jsonDataExceptionE6;
                }
                String str11 = str5;
                String str12 = str4;
                int i2 = i;
                Constructor<ICChipReaderJapanCTSubmitDocumentRequestResidenceCard> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    bool = bool2;
                    declaredConstructor = ICChipReaderJapanCTSubmitDocumentRequestResidenceCard.class.getDeclaredConstructor(String.class, ICChipReaderJapanCTResidenceCardAddress.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE, b.c);
                    this.constructorRef = declaredConstructor;
                    Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
                } else {
                    bool = bool2;
                }
                if (str6 == null) {
                    JsonDataException jsonDataExceptionE7 = b.e("version", "version", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
                    throw jsonDataExceptionE7;
                }
                if (str7 == null) {
                    JsonDataException jsonDataExceptionE8 = b.e("comprehensivePermission", "comprehensive_permission", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
                    throw jsonDataExceptionE8;
                }
                if (str8 == null) {
                    JsonDataException jsonDataExceptionE9 = b.e("individualPermission", "individual_permission", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE9, "missingProperty(...)");
                    throw jsonDataExceptionE9;
                }
                if (bool == null) {
                    JsonDataException jsonDataExceptionE10 = b.e("updateStatus", "update_status", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE10, "missingProperty(...)");
                    throw jsonDataExceptionE10;
                }
                if (str12 == null) {
                    JsonDataException jsonDataExceptionE11 = b.e("photo", "photo", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE11, "missingProperty(...)");
                    throw jsonDataExceptionE11;
                }
                if (str11 == null) {
                    JsonDataException jsonDataExceptionE12 = b.e("front", "front", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE12, "missingProperty(...)");
                    throw jsonDataExceptionE12;
                }
                ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCardNewInstance = declaredConstructor.newInstance(str6, iCChipReaderJapanCTResidenceCardAddress2, str7, str8, bool, str12, str11, Integer.valueOf(i2), null);
                Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTSubmitDocumentRequestResidenceCardNewInstance, "newInstance(...)");
                return iCChipReaderJapanCTSubmitDocumentRequestResidenceCardNewInstance;
            }
            String str13 = str3;
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                case 0:
                    String str14 = (String) this.stringAdapter.a(reader);
                    if (str14 == null) {
                        JsonDataException jsonDataExceptionJ = b.j("version", "version", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    str = str14;
                    str3 = str13;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                    break;
                case 1:
                    iCChipReaderJapanCTResidenceCardAddress = (ICChipReaderJapanCTResidenceCardAddress) this.nullableICChipReaderJapanCTResidenceCardAddressAdapter.a(reader);
                    str3 = str13;
                    str = str6;
                    str2 = str7;
                    i = -3;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.a(reader);
                    if (str2 == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("comprehensivePermission", "comprehensive_permission", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    break;
                    break;
                case 3:
                    String str15 = (String) this.stringAdapter.a(reader);
                    if (str15 == null) {
                        JsonDataException jsonDataExceptionJ3 = b.j("individualPermission", "individual_permission", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                        throw jsonDataExceptionJ3;
                    }
                    str3 = str15;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.a(reader);
                    if (bool2 == null) {
                        JsonDataException jsonDataExceptionJ4 = b.j("updateStatus", "update_status", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                        throw jsonDataExceptionJ4;
                    }
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                case 5:
                    str4 = (String) this.stringAdapter.a(reader);
                    if (str4 == null) {
                        JsonDataException jsonDataExceptionJ5 = b.j("photo", "photo", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ5, "unexpectedNull(...)");
                        throw jsonDataExceptionJ5;
                    }
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                case 6:
                    str5 = (String) this.stringAdapter.a(reader);
                    if (str5 == null) {
                        JsonDataException jsonDataExceptionJ6 = b.j("front", "front", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ6, "unexpectedNull(...)");
                        throw jsonDataExceptionJ6;
                    }
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
                default:
                    str3 = str13;
                    str = str6;
                    iCChipReaderJapanCTResidenceCardAddress = iCChipReaderJapanCTResidenceCardAddress2;
                    str2 = str7;
                    break;
            }
        }
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard = (ICChipReaderJapanCTSubmitDocumentRequestResidenceCard) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTSubmitDocumentRequestResidenceCard == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("version");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107490a);
        writer.h("address");
        this.nullableICChipReaderJapanCTResidenceCardAddressAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107491b);
        writer.h("comprehensive_permission");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107492c);
        writer.h("individual_permission");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.d);
        writer.h("update_status");
        this.booleanAdapter.c(writer, Boolean.valueOf(iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.e));
        writer.h("photo");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f);
        writer.h("front");
        this.stringAdapter.c(writer, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.f107493g);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(75, "GeneratedJsonAdapter(ICChipReaderJapanCTSubmitDocumentRequestResidenceCard)");
    }
}
