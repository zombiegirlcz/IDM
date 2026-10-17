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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCardJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "nullableICChipReaderJapanCTResidenceCardAddressAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDocumentResidenceCardJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;
    private volatile Constructor<ICChipReaderJapanCTDocumentResidenceCard> constructorRef;

    @NotNull
    private final l nullableICChipReaderJapanCTResidenceCardAddressAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDocumentResidenceCardJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"version", "address", "comprehensive_permission", "individual_permission", "update_status"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "version");
        this.nullableICChipReaderJapanCTResidenceCardAddressAdapter = n.a(moshi, ICChipReaderJapanCTResidenceCardAddress.class, "address");
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "updateStatus");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        int i;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        int i2 = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            String str4 = str;
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                String str5 = (String) this.stringAdapter.a(reader);
                if (str5 == null) {
                    JsonDataException jsonDataExceptionJ = b.j("version", "version", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
                str = str5;
            } else if (iP == 1) {
                iCChipReaderJapanCTResidenceCardAddress = (ICChipReaderJapanCTResidenceCardAddress) this.nullableICChipReaderJapanCTResidenceCardAddressAdapter.a(reader);
                str = str4;
                i2 = -3;
            } else if (iP == 2) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = b.j("comprehensivePermission", "comprehensive_permission", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 3) {
                str3 = (String) this.stringAdapter.a(reader);
                if (str3 == null) {
                    JsonDataException jsonDataExceptionJ3 = b.j("individualPermission", "individual_permission", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 4 && (bool = (Boolean) this.booleanAdapter.a(reader)) == null) {
                JsonDataException jsonDataExceptionJ4 = b.j("updateStatus", "update_status", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                throw jsonDataExceptionJ4;
            }
            str = str4;
        }
        String str6 = str;
        reader.h();
        if (i2 == -3) {
            if (str6 == null) {
                JsonDataException jsonDataExceptionE = b.e("version", "version", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (str2 == null) {
                JsonDataException jsonDataExceptionE2 = b.e("comprehensivePermission", "comprehensive_permission", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                throw jsonDataExceptionE2;
            }
            if (str3 == null) {
                JsonDataException jsonDataExceptionE3 = b.e("individualPermission", "individual_permission", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                throw jsonDataExceptionE3;
            }
            if (bool != null) {
                return new ICChipReaderJapanCTDocumentResidenceCard(str6, iCChipReaderJapanCTResidenceCardAddress, str2, str3, bool.booleanValue());
            }
            JsonDataException jsonDataExceptionE4 = b.e("updateStatus", "update_status", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
            throw jsonDataExceptionE4;
        }
        Constructor<ICChipReaderJapanCTDocumentResidenceCard> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            i = i2;
            declaredConstructor = ICChipReaderJapanCTDocumentResidenceCard.class.getDeclaredConstructor(String.class, ICChipReaderJapanCTResidenceCardAddress.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        } else {
            i = i2;
        }
        Constructor<ICChipReaderJapanCTDocumentResidenceCard> constructor = declaredConstructor;
        if (str6 == null) {
            JsonDataException jsonDataExceptionE5 = b.e("version", "version", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
            throw jsonDataExceptionE5;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionE6 = b.e("comprehensivePermission", "comprehensive_permission", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
            throw jsonDataExceptionE6;
        }
        if (str3 == null) {
            JsonDataException jsonDataExceptionE7 = b.e("individualPermission", "individual_permission", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
            throw jsonDataExceptionE7;
        }
        if (bool != null) {
            ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCardNewInstance = constructor.newInstance(str6, iCChipReaderJapanCTResidenceCardAddress, str2, str3, bool, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTDocumentResidenceCardNewInstance, "newInstance(...)");
            return iCChipReaderJapanCTDocumentResidenceCardNewInstance;
        }
        JsonDataException jsonDataExceptionE8 = b.e("updateStatus", "update_status", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
        throw jsonDataExceptionE8;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard = (ICChipReaderJapanCTDocumentResidenceCard) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDocumentResidenceCard == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("version");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentResidenceCard.f107446a);
        writer.h("address");
        this.nullableICChipReaderJapanCTResidenceCardAddressAdapter.c(writer, iCChipReaderJapanCTDocumentResidenceCard.f107447b);
        writer.h("comprehensive_permission");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentResidenceCard.f107448c);
        writer.h("individual_permission");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDocumentResidenceCard.d);
        writer.h("update_status");
        this.booleanAdapter.c(writer, Boolean.valueOf(iCChipReaderJapanCTDocumentResidenceCard.e));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(62, "GeneratedJsonAdapter(ICChipReaderJapanCTDocumentResidenceCard)");
    }
}
