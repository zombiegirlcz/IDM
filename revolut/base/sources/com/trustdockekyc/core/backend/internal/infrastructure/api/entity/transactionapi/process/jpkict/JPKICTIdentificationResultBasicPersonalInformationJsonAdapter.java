package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

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
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformationJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/jpkict/JPKICTIdentificationResultBasicPersonalInformation;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "", "stringAdapter", "Lk1m/l;", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JPKICTIdentificationResultBasicPersonalInformationJsonAdapter extends l {
    private volatile Constructor<JPKICTIdentificationResultBasicPersonalInformation> constructorRef;

    @NotNull
    private final l nullableStringAdapter;

    @NotNull
    private final o options;

    @NotNull
    private final l stringAdapter;

    public JPKICTIdentificationResultBasicPersonalInformationJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"name", "birth", "gender", "address", "individual_number"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.stringAdapter = n.a(moshi, String.class, "name");
        this.nullableStringAdapter = n.a(moshi, String.class, "individualNumber");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = -1;
        while (reader.i()) {
            int iP = reader.p(this.options);
            if (iP == -1) {
                reader.q();
                reader.r();
            } else if (iP == 0) {
                str = (String) this.stringAdapter.a(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionJ = l1m.b.j("name", "name", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                    throw jsonDataExceptionJ;
                }
            } else if (iP == 1) {
                str2 = (String) this.stringAdapter.a(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionJ2 = l1m.b.j("birth", "birth", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                    throw jsonDataExceptionJ2;
                }
            } else if (iP == 2) {
                str3 = (String) this.stringAdapter.a(reader);
                if (str3 == null) {
                    JsonDataException jsonDataExceptionJ3 = l1m.b.j("gender", "gender", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ3, "unexpectedNull(...)");
                    throw jsonDataExceptionJ3;
                }
            } else if (iP == 3) {
                str4 = (String) this.stringAdapter.a(reader);
                if (str4 == null) {
                    JsonDataException jsonDataExceptionJ4 = l1m.b.j("address", "address", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ4, "unexpectedNull(...)");
                    throw jsonDataExceptionJ4;
                }
            } else if (iP == 4) {
                str5 = (String) this.nullableStringAdapter.a(reader);
                i = -17;
            }
        }
        reader.h();
        if (i == -17) {
            String str6 = str5;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            if (str10 == null) {
                JsonDataException jsonDataExceptionE = l1m.b.e("name", "name", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (str9 == null) {
                JsonDataException jsonDataExceptionE2 = l1m.b.e("birth", "birth", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
                throw jsonDataExceptionE2;
            }
            if (str8 == null) {
                JsonDataException jsonDataExceptionE3 = l1m.b.e("gender", "gender", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
                throw jsonDataExceptionE3;
            }
            if (str7 != null) {
                return new JPKICTIdentificationResultBasicPersonalInformation(str10, str9, str8, str7, str6);
            }
            JsonDataException jsonDataExceptionE4 = l1m.b.e("address", "address", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
            throw jsonDataExceptionE4;
        }
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        String str15 = str;
        Constructor<JPKICTIdentificationResultBasicPersonalInformation> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = JPKICTIdentificationResultBasicPersonalInformation.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, l1m.b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<JPKICTIdentificationResultBasicPersonalInformation> constructor = declaredConstructor;
        if (str15 == null) {
            JsonDataException jsonDataExceptionE5 = l1m.b.e("name", "name", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE5, "missingProperty(...)");
            throw jsonDataExceptionE5;
        }
        if (str14 == null) {
            JsonDataException jsonDataExceptionE6 = l1m.b.e("birth", "birth", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE6, "missingProperty(...)");
            throw jsonDataExceptionE6;
        }
        if (str13 == null) {
            JsonDataException jsonDataExceptionE7 = l1m.b.e("gender", "gender", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE7, "missingProperty(...)");
            throw jsonDataExceptionE7;
        }
        if (str12 != null) {
            JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformationNewInstance = constructor.newInstance(str15, str14, str13, str12, str11, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(jPKICTIdentificationResultBasicPersonalInformationNewInstance, "newInstance(...)");
            return jPKICTIdentificationResultBasicPersonalInformationNewInstance;
        }
        JsonDataException jsonDataExceptionE8 = l1m.b.e("address", "address", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE8, "missingProperty(...)");
        throw jsonDataExceptionE8;
    }

    public final void c(t writer, Object obj2) {
        JPKICTIdentificationResultBasicPersonalInformation jPKICTIdentificationResultBasicPersonalInformation = (JPKICTIdentificationResultBasicPersonalInformation) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (jPKICTIdentificationResultBasicPersonalInformation == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("name");
        this.stringAdapter.c(writer, jPKICTIdentificationResultBasicPersonalInformation.f107517a);
        writer.h("birth");
        this.stringAdapter.c(writer, jPKICTIdentificationResultBasicPersonalInformation.f107518b);
        writer.h("gender");
        this.stringAdapter.c(writer, jPKICTIdentificationResultBasicPersonalInformation.f107519c);
        writer.h("address");
        this.stringAdapter.c(writer, jPKICTIdentificationResultBasicPersonalInformation.d);
        writer.h("individual_number");
        this.nullableStringAdapter.c(writer, jPKICTIdentificationResultBasicPersonalInformation.e);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(72, "GeneratedJsonAdapter(JPKICTIdentificationResultBasicPersonalInformation)");
    }
}
