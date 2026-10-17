package com.google.android.gms.common.server.response;

import a0.d;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        Object zac(@NonNull Object obj2);

        @NonNull
        Object zad(@NonNull Object obj2);
    }

    @NonNull
    public static final Object zaD(@NonNull Field field, Object obj2) {
        return field.zak != null ? field.zaf(obj2) : obj2;
    }

    private final void zaE(Field field, Object obj2) {
        int i = field.f38232zac;
        Object objZae = field.zae(obj2);
        String str = field.f38234zae;
        switch (i) {
            case 0:
                if (objZae != null) {
                    setIntegerInternal(field, str, ((Integer) objZae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) objZae);
                return;
            case 2:
                if (objZae != null) {
                    setLongInternal(field, str, ((Long) objZae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(d.n("Unsupported type for conversion: ", i));
            case 4:
                if (objZae != null) {
                    zan(field, str, ((Double) objZae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) objZae);
                return;
            case 6:
                if (objZae != null) {
                    setBooleanInternal(field, str, ((Boolean) objZae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) objZae);
                return;
            case 8:
            case 9:
                if (objZae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) objZae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb6, Field field, Object obj2) {
        int i = field.zaa;
        if (i == 11) {
            Class cls = field.f38236zag;
            Preconditions.checkNotNull(cls);
            sb6.append(((FastJsonResponse) cls.cast(obj2)).toString());
        } else {
            if (i != 7) {
                sb6.append(obj2);
                return;
            }
            sb6.append("\"");
            sb6.append(JsonUtils.escapeString((String) obj2));
            sb6.append("\"");
        }
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            String str2 = "Output field (" + str + ") has a null value, but expected a primitive";
        }
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@NonNull Field field, @NonNull String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@NonNull Field field, @NonNull String str, @NonNull T t2) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @NonNull
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @KeepForSdk
    public Object getFieldValue(@NonNull Field field) {
        String str = field.f38234zae;
        if (field.f38236zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.f38234zae);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @KeepForSdk
    public abstract Object getValueObject(@NonNull String str);

    @KeepForSdk
    public boolean isFieldSet(@NonNull Field field) {
        if (field.f38232zac != 11) {
            return isPrimitiveFieldSet(field.f38234zae);
        }
        if (field.f38233zad) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@NonNull String str);

    @KeepForSdk
    public void setBooleanInternal(@NonNull Field<?, ?> field, @NonNull String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@NonNull Field<?, ?> field, @NonNull String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@NonNull Field<?, ?> field, @NonNull String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@NonNull Field<?, ?> field, @NonNull String str, long j2) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@NonNull Field<?, ?> field, @NonNull String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@NonNull Field<?, ?> field, @NonNull String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@NonNull Field<?, ?> field, @NonNull String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @NonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb6 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaD = zaD(field, getFieldValue(field));
                if (sb6.length() == 0) {
                    sb6.append("{");
                } else {
                    sb6.append(",");
                }
                d.C(sb6, "\"", str, "\":");
                if (objZaD != null) {
                    switch (field.f38232zac) {
                        case 8:
                            sb6.append("\"");
                            sb6.append(Base64Utils.encode((byte[]) objZaD));
                            sb6.append("\"");
                            break;
                        case 9:
                            sb6.append("\"");
                            sb6.append(Base64Utils.encodeUrlSafe((byte[]) objZaD));
                            sb6.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb6, (HashMap) objZaD);
                            break;
                        default:
                            if (field.f38231zab) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb6.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb6.append(",");
                                    }
                                    Object obj2 = arrayList.get(i);
                                    if (obj2 != null) {
                                        zaF(sb6, field, obj2);
                                    }
                                }
                                sb6.append("]");
                            } else {
                                zaF(sb6, field, objZaD);
                            }
                            break;
                    }
                } else {
                    sb6.append("null");
                }
            }
        }
        if (sb6.length() > 0) {
            sb6.append("}");
        } else {
            sb6.append("{}");
        }
        return sb6.toString();
    }

    public final void zaA(@NonNull Field field, String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.f38234zae, str);
        }
    }

    public final void zaB(@NonNull Field field, Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.f38234zae, map);
        }
    }

    public final void zaC(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.f38234zae, arrayList);
        }
    }

    public final void zaa(@NonNull Field field, BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.f38234zae, bigDecimal);
        }
    }

    public void zab(@NonNull Field field, @NonNull String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.f38234zae, arrayList);
        }
    }

    public void zad(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(@NonNull Field field, BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.f38234zae, bigInteger);
        }
    }

    public void zaf(@NonNull Field field, @NonNull String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.f38234zae, arrayList);
        }
    }

    public void zah(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(@NonNull Field field, boolean z) {
        if (field.zak != null) {
            zaE(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.f38234zae, z);
        }
    }

    public final void zaj(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.f38234zae, arrayList);
        }
    }

    public void zak(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(@NonNull Field field, byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.f38234zae, bArr);
        }
    }

    public final void zam(@NonNull Field field, double d) {
        if (field.zak != null) {
            zaE(field, Double.valueOf(d));
        } else {
            zan(field, field.f38234zae, d);
        }
    }

    public void zan(@NonNull Field field, @NonNull String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.f38234zae, arrayList);
        }
    }

    public void zap(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(@NonNull Field field, float f) {
        if (field.zak != null) {
            zaE(field, Float.valueOf(f));
        } else {
            zar(field, field.f38234zae, f);
        }
    }

    public void zar(@NonNull Field field, @NonNull String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.f38234zae, arrayList);
        }
    }

    public void zat(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(@NonNull Field field, int i) {
        if (field.zak != null) {
            zaE(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.f38234zae, i);
        }
    }

    public final void zav(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.f38234zae, arrayList);
        }
    }

    public void zaw(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(@NonNull Field field, long j2) {
        if (field.zak != null) {
            zaE(field, Long.valueOf(j2));
        } else {
            setLongInternal(field, field.f38234zae, j2);
        }
    }

    public final void zay(@NonNull Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.f38234zae, arrayList);
        }
    }

    public void zaz(@NonNull Field field, @NonNull String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        /* JADX INFO: renamed from: zab, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean f38231zab;

        /* JADX INFO: renamed from: zac, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int f38232zac;

        /* JADX INFO: renamed from: zad, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean f38233zad;

        /* JADX INFO: renamed from: zae, reason: collision with root package name */
        @NonNull
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String f38234zae;

        /* JADX INFO: renamed from: zaf, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int f38235zaf;

        /* JADX INFO: renamed from: zag, reason: collision with root package name */
        protected final Class f38236zag;

        /* JADX INFO: renamed from: zah, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String f38237zah;

        /* JADX INFO: renamed from: zai, reason: collision with root package name */
        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int f38238zai;

        /* JADX INFO: renamed from: zaj, reason: collision with root package name */
        private zan f38239zaj;

        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private final FieldConverter zak;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i5, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.f38238zai = i;
            this.zaa = i2;
            this.f38231zab = z;
            this.f38232zac = i3;
            this.f38233zad = z3;
            this.f38234zae = str;
            this.f38235zaf = i5;
            if (str2 == null) {
                this.f38236zag = null;
                this.f38237zah = null;
            } else {
                this.f38236zag = SafeParcelResponse.class;
                this.f38237zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        @NonNull
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@NonNull String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@NonNull String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Double, Double> forDouble(@NonNull String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Float, Float> forFloat(@NonNull String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@NonNull String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<Long, Long> forLong(@NonNull String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<String, String> forString(@NonNull String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@NonNull String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@NonNull String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @NonNull
        @KeepForSdk
        public static Field withConverter(@NonNull String str, int i, @NonNull FieldConverter<?, ?> fieldConverter, boolean z) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z, 0, false, str, i, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.f38235zaf;
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.f38238zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.f38231zab)).add("typeOut", Integer.valueOf(this.f38232zac)).add("typeOutArray", Boolean.valueOf(this.f38233zad)).add("outputFieldName", this.f38234zae).add("safeParcelFieldId", Integer.valueOf(this.f38235zaf)).add("concreteTypeName", zag());
            Class cls = this.f38236zag;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int i2 = this.f38238zai;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i2);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.f38231zab);
            SafeParcelWriter.writeInt(parcel, 4, this.f38232zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.f38233zad);
            SafeParcelWriter.writeString(parcel, 6, this.f38234zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        @NonNull
        public final Field zab() {
            return new Field(this.f38238zai, this.zaa, this.f38231zab, this.f38232zac, this.f38233zad, this.f38234zae, this.f38235zaf, this.f38237zah, zaa());
        }

        @NonNull
        public final FastJsonResponse zad() throws IllegalAccessException, InstantiationException {
            Preconditions.checkNotNull(this.f38236zag);
            Class cls = this.f38236zag;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.f38237zah);
            Preconditions.checkNotNull(this.f38239zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.f38239zaj, this.f38237zah);
        }

        @NonNull
        public final Object zae(Object obj2) {
            Preconditions.checkNotNull(this.zak);
            return Preconditions.checkNotNull(this.zak.zac(obj2));
        }

        @NonNull
        public final Object zaf(@NonNull Object obj2) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj2);
        }

        public final String zag() {
            String str = this.f38237zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        @NonNull
        public final Map zah() {
            Preconditions.checkNotNull(this.f38237zah);
            Preconditions.checkNotNull(this.f38239zaj);
            return (Map) Preconditions.checkNotNull(this.f38239zaj.zab(this.f38237zah));
        }

        public final void zai(zan zanVar) {
            this.f38239zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        public Field(int i, boolean z, int i2, boolean z3, @NonNull String str, int i3, Class cls, FieldConverter fieldConverter) {
            this.f38238zai = 1;
            this.zaa = i;
            this.f38231zab = z;
            this.f38232zac = i2;
            this.f38233zad = z3;
            this.f38234zae = str;
            this.f38235zaf = i3;
            this.f38236zag = cls;
            if (cls == null) {
                this.f38237zah = null;
            } else {
                this.f38237zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
