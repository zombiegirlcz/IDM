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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategoryJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseVehicleCategory;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTDriversLicenseVehicleCategoryJsonAdapter extends l {
    private volatile Constructor<ICChipReaderJapanCTDriversLicenseVehicleCategory> constructorRef;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public ICChipReaderJapanCTDriversLicenseVehicleCategoryJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"name", "issue_date"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "name");
        this.nullableStringAdapter = n.a(moshi, String.class, "issueDate");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = b.j("name", "name", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.nullableStringAdapter.a(reader);
                i = -3;
            }
        }
        reader.h();
        if (i == -3) {
            if (str != null) {
                return new ICChipReaderJapanCTDriversLicenseVehicleCategory(str, str2);
            }
            JsonDataException jsonDataExceptionE = b.e("name", "name", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
            throw jsonDataExceptionE;
        }
        Constructor<ICChipReaderJapanCTDriversLicenseVehicleCategory> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ICChipReaderJapanCTDriversLicenseVehicleCategory.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str != null) {
            ICChipReaderJapanCTDriversLicenseVehicleCategory iCChipReaderJapanCTDriversLicenseVehicleCategoryNewInstance = declaredConstructor.newInstance(str, str2, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTDriversLicenseVehicleCategoryNewInstance, "newInstance(...)");
            return iCChipReaderJapanCTDriversLicenseVehicleCategoryNewInstance;
        }
        JsonDataException jsonDataExceptionE2 = b.e("name", "name", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
        throw jsonDataExceptionE2;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTDriversLicenseVehicleCategory iCChipReaderJapanCTDriversLicenseVehicleCategory = (ICChipReaderJapanCTDriversLicenseVehicleCategory) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTDriversLicenseVehicleCategory == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("name");
        this.stringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseVehicleCategory.f107477a);
        writer.h("issue_date");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTDriversLicenseVehicleCategory.f107478b);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(70, "GeneratedJsonAdapter(ICChipReaderJapanCTDriversLicenseVehicleCategory)");
    }
}
