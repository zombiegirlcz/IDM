package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddressJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTResidenceCardAddress;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "nullableStringAdapter", "Lk1m/l;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTResidenceCardAddressJsonAdapter extends l {
    private volatile Constructor<ICChipReaderJapanCTResidenceCardAddress> constructorRef;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    public ICChipReaderJapanCTResidenceCardAddressJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"address", "code", "date"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.nullableStringAdapter = n.a(moshi, String.class, "address");
    }

    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.nullableStringAdapter.a(reader);
                i &= -2;
            } else if (iP == 1) {
                str2 = (String) this.nullableStringAdapter.a(reader);
                i &= -3;
            } else if (iP == 2) {
                str3 = (String) this.nullableStringAdapter.a(reader);
                i &= -5;
            }
        }
        reader.h();
        if (i == -8) {
            return new ICChipReaderJapanCTResidenceCardAddress(str, str2, str3);
        }
        Constructor<ICChipReaderJapanCTResidenceCardAddress> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ICChipReaderJapanCTResidenceCardAddress.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddressNewInstance = declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTResidenceCardAddressNewInstance, "newInstance(...)");
        return iCChipReaderJapanCTResidenceCardAddressNewInstance;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTResidenceCardAddress iCChipReaderJapanCTResidenceCardAddress = (ICChipReaderJapanCTResidenceCardAddress) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTResidenceCardAddress == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("address");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTResidenceCardAddress.f107479a);
        writer.h("code");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTResidenceCardAddress.f107480b);
        writer.h("date");
        this.nullableStringAdapter.c(writer, iCChipReaderJapanCTResidenceCardAddress.f107481c);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(61, "GeneratedJsonAdapter(ICChipReaderJapanCTResidenceCardAddress)");
    }
}
