package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.internal.measurement.zzrd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes16.dex */
public final class zzqa extends zzpg {
    public zzqa(zzpv zzpvVar) {
        super(zzpvVar);
    }

    public static boolean zzA(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] zzC(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it8.next();
            if (zzhqVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhq zzhqVar2 : zzhqVar.zzi()) {
                    if (zzhqVar2.zzy()) {
                        bundle.putString(zzhqVar2.zzg(), zzhqVar2.zzh());
                    } else if (zzhqVar2.zzw()) {
                        bundle.putLong(zzhqVar2.zzg(), zzhqVar2.zzd());
                    } else if (zzhqVar2.zzu()) {
                        bundle.putDouble(zzhqVar2.zzg(), zzhqVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void zzD(com.google.android.gms.internal.measurement.zzhl zzhlVar, String str, Object obj2) {
        List listZzp = zzhlVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhq) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
        zzhpVarZze.zzj(str);
        zzhpVarZze.zzi(((Long) obj2).longValue());
        if (i >= 0) {
            zzhlVar.zzj(i, zzhpVarZze);
        } else {
            zzhlVar.zze(zzhpVarZze);
        }
    }

    public static final boolean zzE(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzbhVar);
        Preconditions.checkNotNull(zzrVar);
        return (TextUtils.isEmpty(zzrVar.f47737zzb) && TextUtils.isEmpty(zzrVar.zzp)) ? false : true;
    }

    public static final Bundle zzF(List list) {
        Bundle bundle = new Bundle();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it8.next();
            String strZzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putDouble(strZzg, zzhqVar.zza());
            } else if (zzhqVar.zzv()) {
                bundle.putFloat(strZzg, zzhqVar.zzb());
            } else if (zzhqVar.zzy()) {
                bundle.putString(strZzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putLong(strZzg, zzhqVar.zzd());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.zzhq zzG(com.google.android.gms.internal.measurement.zzhm zzhmVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zzhmVar.zzi()) {
            if (zzhqVar.zzg().equals(str)) {
                return zzhqVar;
            }
        }
        return null;
    }

    public static final Object zzH(com.google.android.gms.internal.measurement.zzhm zzhmVar, String str) {
        com.google.android.gms.internal.measurement.zzhq zzhqVarZzG = zzG(zzhmVar, str);
        if (zzhqVarZzG == null) {
            return null;
        }
        if (zzhqVarZzG.zzy()) {
            return zzhqVarZzG.zzh();
        }
        if (zzhqVarZzG.zzw()) {
            return Long.valueOf(zzhqVarZzG.zzd());
        }
        if (zzhqVarZzG.zzu()) {
            return Double.valueOf(zzhqVarZzG.zza());
        }
        if (zzhqVarZzG.zzc() > 0) {
            return zzC(zzhqVarZzG.zzi());
        }
        return null;
    }

    public static final Object zzI(com.google.android.gms.internal.measurement.zzhm zzhmVar, String str, Object obj2) {
        Object objZzH = zzH(zzhmVar, str);
        return objZzH == null ? obj2 : objZzH;
    }

    private final void zzJ(StringBuilder sb6, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            com.google.android.gms.internal.measurement.zzhq zzhqVar = (com.google.android.gms.internal.measurement.zzhq) it8.next();
            if (zzhqVar != null) {
                zzL(sb6, i2);
                sb6.append("param {\n");
                zzQ(sb6, i2, "name", zzhqVar.zzx() ? this.zzu.zzj().zze(zzhqVar.zzg()) : null);
                zzQ(sb6, i2, "string_value", zzhqVar.zzy() ? zzhqVar.zzh() : null);
                zzQ(sb6, i2, "int_value", zzhqVar.zzw() ? Long.valueOf(zzhqVar.zzd()) : null);
                zzQ(sb6, i2, "double_value", zzhqVar.zzu() ? Double.valueOf(zzhqVar.zza()) : null);
                if (zzhqVar.zzc() > 0) {
                    zzJ(sb6, i2, zzhqVar.zzi());
                }
                zzL(sb6, i2);
                sb6.append("}\n");
            }
        }
    }

    private final void zzK(StringBuilder sb6, int i, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        String str;
        if (zzflVar == null) {
            return;
        }
        zzL(sb6, i);
        sb6.append("filter {\n");
        if (zzflVar.zzh()) {
            zzQ(sb6, i, "complement", Boolean.valueOf(zzflVar.zzg()));
        }
        if (zzflVar.zzj()) {
            zzQ(sb6, i, "param_name", this.zzu.zzj().zze(zzflVar.zze()));
        }
        if (zzflVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzfv zzfvVarZzd = zzflVar.zzd();
            if (zzfvVarZzd != null) {
                zzL(sb6, i2);
                sb6.append("string_filter {\n");
                if (zzfvVarZzd.zzi()) {
                    switch (zzfvVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzQ(sb6, i2, "match_type", str);
                }
                if (zzfvVarZzd.zzh()) {
                    zzQ(sb6, i2, "expression", zzfvVarZzd.zzd());
                }
                if (zzfvVarZzd.zzg()) {
                    zzQ(sb6, i2, "case_sensitive", Boolean.valueOf(zzfvVarZzd.zzf()));
                }
                if (zzfvVarZzd.zza() > 0) {
                    zzL(sb6, i + 2);
                    sb6.append("expression_list {\n");
                    for (String str2 : zzfvVarZzd.zze()) {
                        zzL(sb6, i + 3);
                        sb6.append(str2);
                        sb6.append("\n");
                    }
                    sb6.append("}\n");
                }
                zzL(sb6, i2);
                sb6.append("}\n");
            }
        }
        if (zzflVar.zzi()) {
            zzR(sb6, i + 1, "number_filter", zzflVar.zzc());
        }
        zzL(sb6, i);
        sb6.append("}\n");
    }

    private static final void zzL(StringBuilder sb6, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb6.append("  ");
        }
    }

    private static final void zzM(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final String zzN(boolean z, boolean z3, boolean z4) {
        StringBuilder sb6 = new StringBuilder();
        if (z) {
            sb6.append("Dynamic ");
        }
        if (z3) {
            sb6.append("Sequence ");
        }
        if (z4) {
            sb6.append("Session-Scoped ");
        }
        return sb6.toString();
    }

    private static final void zzO(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zzM(builder, str3, string, set);
            }
        }
    }

    private static final void zzP(StringBuilder sb6, int i, String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        if (zzicVar == null) {
            return;
        }
        zzL(sb6, 3);
        sb6.append(str);
        sb6.append(" {\n");
        if (zzicVar.zzb() != 0) {
            zzL(sb6, 4);
            sb6.append("results: ");
            int i2 = 0;
            for (Long l2 : zzicVar.zzi()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb6.append(", ");
                }
                sb6.append(l2);
                i2 = i3;
            }
            sb6.append('\n');
        }
        if (zzicVar.zzd() != 0) {
            zzL(sb6, 4);
            sb6.append("status: ");
            int i5 = 0;
            for (Long l3 : zzicVar.zzk()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb6.append(", ");
                }
                sb6.append(l3);
                i5 = i6;
            }
            sb6.append('\n');
        }
        if (zzicVar.zza() != 0) {
            zzL(sb6, 4);
            sb6.append("dynamic_filter_timestamps: {");
            int i21 = 0;
            for (com.google.android.gms.internal.measurement.zzhk zzhkVar : zzicVar.zzh()) {
                int i22 = i21 + 1;
                if (i21 != 0) {
                    sb6.append(", ");
                }
                sb6.append(zzhkVar.zzh() ? Integer.valueOf(zzhkVar.zza()) : null);
                sb6.append(":");
                sb6.append(zzhkVar.zzg() ? Long.valueOf(zzhkVar.zzb()) : null);
                i21 = i22;
            }
            sb6.append("}\n");
        }
        if (zzicVar.zzc() != 0) {
            zzL(sb6, 4);
            sb6.append("sequence_filter_timestamps: {");
            int i32 = 0;
            for (com.google.android.gms.internal.measurement.zzie zzieVar : zzicVar.zzj()) {
                int i33 = i32 + 1;
                if (i32 != 0) {
                    sb6.append(", ");
                }
                sb6.append(zzieVar.zzi() ? Integer.valueOf(zzieVar.zzb()) : null);
                sb6.append(": [");
                Iterator it8 = zzieVar.zzf().iterator();
                int i43 = 0;
                while (it8.hasNext()) {
                    long jLongValue = ((Long) it8.next()).longValue();
                    int i59 = i43 + 1;
                    if (i43 != 0) {
                        sb6.append(", ");
                    }
                    sb6.append(jLongValue);
                    i43 = i59;
                }
                sb6.append("]");
                i32 = i33;
            }
            sb6.append("}\n");
        }
        zzL(sb6, 3);
        sb6.append("}\n");
    }

    private static final void zzQ(StringBuilder sb6, int i, String str, Object obj2) {
        if (obj2 == null) {
            return;
        }
        zzL(sb6, i + 1);
        sb6.append(str);
        sb6.append(": ");
        sb6.append(obj2);
        sb6.append('\n');
    }

    private static final void zzR(StringBuilder sb6, int i, String str, com.google.android.gms.internal.measurement.zzfp zzfpVar) {
        if (zzfpVar == null) {
            return;
        }
        zzL(sb6, i);
        sb6.append(str);
        sb6.append(" {\n");
        if (zzfpVar.zzg()) {
            int iZzm = zzfpVar.zzm();
            zzQ(sb6, i, "comparison_type", iZzm != 1 ? iZzm != 2 ? iZzm != 3 ? iZzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzfpVar.zzi()) {
            zzQ(sb6, i, "match_as_float", Boolean.valueOf(zzfpVar.zzf()));
        }
        if (zzfpVar.zzh()) {
            zzQ(sb6, i, "comparison_value", zzfpVar.zzc());
        }
        if (zzfpVar.zzk()) {
            zzQ(sb6, i, "min_comparison_value", zzfpVar.zze());
        }
        if (zzfpVar.zzj()) {
            zzQ(sb6, i, "max_comparison_value", zzfpVar.zzd());
        }
        zzL(sb6, i);
        sb6.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzhw zzhwVar, String str) {
        for (int i = 0; i < zzhwVar.zzd(); i++) {
            if (str.equals(zzhwVar.zzaE(i).zzg())) {
                return i;
            }
        }
        return -1;
    }

    public static com.google.android.gms.internal.measurement.zzng zzp(com.google.android.gms.internal.measurement.zzng zzngVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzmm {
        com.google.android.gms.internal.measurement.zzlp zzlpVarZza = com.google.android.gms.internal.measurement.zzlp.zza();
        return zzlpVarZza != null ? zzngVar.zzaV(bArr, zzlpVarZza) : zzngVar.zzaU(bArr);
    }

    public static List zzu(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j2 |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static boolean zzy(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public final byte[] zzB(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzu.zzaW().zze().zzb("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    public final boolean zzb() {
        return false;
    }

    public final long zzd(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzf(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long zzf(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzio zzioVar = this.zzu;
        zzioVar.zzw().zzg();
        MessageDigest messageDigestZzI = zzqf.zzI();
        if (messageDigestZzI != null) {
            return zzqf.zzr(messageDigestZzI.digest(bArr));
        }
        a.w(zzioVar, "Failed to get MD5");
        return 0L;
    }

    public final Bundle zzh(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                bundle.putString(str, null);
            } else if (obj2 instanceof Long) {
                bundle.putLong(str, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                bundle.putDouble(str, ((Double) obj2).doubleValue());
            } else if (!(obj2 instanceof ArrayList)) {
                bundle.putString(str, obj2.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzh((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable zzi(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (SafeParcelReader.ParseException unused) {
                this.zzu.zzaW().zze().zza("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzbh zzj(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj2;
        Bundle bundleZzh = zzh(zzaaVar.zzf(), true);
        String string = (!bundleZzh.containsKey("_o") || (obj2 = bundleZzh.get("_o")) == null) ? "app" : obj2.toString();
        String strZzb = zzjy.zzb(zzaaVar.zze());
        if (strZzb == null) {
            strZzb = zzaaVar.zze();
        }
        return new zzbh(strZzb, new zzbf(bundleZzh), string, zzaaVar.zza());
    }

    public final zzov zzl(String str, com.google.android.gms.internal.measurement.zzhw zzhwVar, com.google.android.gms.internal.measurement.zzhl zzhlVar, String str2) {
        int iIndexOf;
        zzqr.zzb();
        zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(str, zzgi.zzaV)) {
            return null;
        }
        long jCurrentTimeMillis = zzioVar.zzaU().currentTimeMillis();
        String[] strArrSplit = zzioVar.zzf().zzr(str, zzgi.zzat).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: ".concat(str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        zzpv zzpvVar = this.f47639zzg;
        zzpi zzpiVarZzy = zzpvVar.zzy();
        String strZzm = zzpiVarZzy.f47639zzg.zzr().zzm(str);
        Uri.Builder builder = new Uri.Builder();
        zzio zzioVar2 = zzpiVarZzy.zzu;
        builder.scheme(zzioVar2.zzf().zzr(str, zzgi.zzam));
        if (TextUtils.isEmpty(strZzm)) {
            builder.authority(zzioVar2.zzf().zzr(str, zzgi.zzan));
        } else {
            builder.authority(strZzm + "." + zzioVar2.zzf().zzr(str, zzgi.zzan));
        }
        builder.path(zzioVar2.zzf().zzr(str, zzgi.zzao));
        zzM(builder, "gmp_app_id", zzhwVar.zzaJ(), setUnmodifiableSet);
        zzioVar.zzf().zzj();
        zzM(builder, "gmp_version", String.valueOf(119002L), setUnmodifiableSet);
        String strZzaG = zzhwVar.zzaG();
        zzam zzamVarZzf = zzioVar.zzf();
        zzgg zzggVar = zzgi.zzaY;
        if (zzamVarZzf.zzx(str, zzggVar) && zzpvVar.zzr().zzA(str)) {
            strZzaG = "";
        }
        zzM(builder, "app_instance_id", strZzaG, setUnmodifiableSet);
        zzM(builder, "rdid", zzhwVar.zzaL(), setUnmodifiableSet);
        zzM(builder, "bundle_id", zzhwVar.zzaF(), setUnmodifiableSet);
        String strZzo = zzhlVar.zzo();
        String strZza = zzjy.zza(strZzo);
        if (true != TextUtils.isEmpty(strZza)) {
            strZzo = strZza;
        }
        zzM(builder, "app_event_name", strZzo, setUnmodifiableSet);
        zzM(builder, "app_version", String.valueOf(zzhwVar.zzb()), setUnmodifiableSet);
        String strZzaK = zzhwVar.zzaK();
        if (zzioVar.zzf().zzx(str, zzggVar) && zzpvVar.zzr().zzE(str) && !TextUtils.isEmpty(strZzaK) && (iIndexOf = strZzaK.indexOf(".")) != -1) {
            strZzaK = strZzaK.substring(0, iIndexOf);
        }
        zzM(builder, "os_version", strZzaK, setUnmodifiableSet);
        zzM(builder, "timestamp", String.valueOf(zzhlVar.zzc()), setUnmodifiableSet);
        if (zzhwVar.zzaP()) {
            zzM(builder, "lat", "1", setUnmodifiableSet);
        }
        zzM(builder, "privacy_sandbox_version", String.valueOf(zzhwVar.zza()), setUnmodifiableSet);
        zzM(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        zzM(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        zzM(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.zzhq> listZzp = zzhlVar.zzp();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhq zzhqVar : listZzp) {
            String strZzg = zzhqVar.zzg();
            if (zzhqVar.zzu()) {
                bundle.putString(strZzg, String.valueOf(zzhqVar.zza()));
            } else if (zzhqVar.zzv()) {
                bundle.putString(strZzg, String.valueOf(zzhqVar.zzb()));
            } else if (zzhqVar.zzy()) {
                bundle.putString(strZzg, zzhqVar.zzh());
            } else if (zzhqVar.zzw()) {
                bundle.putString(strZzg, String.valueOf(zzhqVar.zzd()));
            }
        }
        zzO(builder, zzioVar.zzf().zzr(str, zzgi.zzas).split("\\|"), bundle, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.zzio> listZzaN = zzhwVar.zzaN();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zzio zzioVar3 : listZzaN) {
            String strZzg2 = zzioVar3.zzg();
            if (zzioVar3.zzr()) {
                bundle2.putString(strZzg2, String.valueOf(zzioVar3.zza()));
            } else if (zzioVar3.zzs()) {
                bundle2.putString(strZzg2, String.valueOf(zzioVar3.zzb()));
            } else if (zzioVar3.zzv()) {
                bundle2.putString(strZzg2, zzioVar3.zzh());
            } else if (zzioVar3.zzt()) {
                bundle2.putString(strZzg2, String.valueOf(zzioVar3.zzc()));
            }
        }
        zzO(builder, zzioVar.zzf().zzr(str, zzgi.zzar).split("\\|"), bundle2, setUnmodifiableSet);
        zzM(builder, "dma", true != zzhwVar.zzaO() ? "0" : "1", setUnmodifiableSet);
        if (!zzhwVar.zzaI().isEmpty()) {
            zzM(builder, "dma_cps", zzhwVar.zzaI(), setUnmodifiableSet);
        }
        if (zzhwVar.zzaQ()) {
            com.google.android.gms.internal.measurement.zzhc zzhcVarZzg = zzhwVar.zzg();
            if (!zzhcVarZzg.zzh().isEmpty()) {
                zzM(builder, "dl_gclid", zzhcVarZzg.zzh(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzg().isEmpty()) {
                zzM(builder, "dl_gbraid", zzhcVarZzg.zzg(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzf().isEmpty()) {
                zzM(builder, "dl_gs", zzhcVarZzg.zzf(), setUnmodifiableSet);
            }
            if (zzhcVarZzg.zza() > 0) {
                zzM(builder, "dl_ss_ts", String.valueOf(zzhcVarZzg.zza()), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzk().isEmpty()) {
                zzM(builder, "mr_gclid", zzhcVarZzg.zzk(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzj().isEmpty()) {
                zzM(builder, "mr_gbraid", zzhcVarZzg.zzj(), setUnmodifiableSet);
            }
            if (!zzhcVarZzg.zzi().isEmpty()) {
                zzM(builder, "mr_gs", zzhcVarZzg.zzi(), setUnmodifiableSet);
            }
            if (zzhcVarZzg.zzb() > 0) {
                zzM(builder, "mr_click_ts", String.valueOf(zzhcVarZzg.zzb()), setUnmodifiableSet);
            }
        }
        return new zzov(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final com.google.android.gms.internal.measurement.zzhm zzm(zzbc zzbcVar) {
        com.google.android.gms.internal.measurement.zzhl zzhlVarZze = com.google.android.gms.internal.measurement.zzhm.zze();
        zzhlVarZze.zzl(zzbcVar.f46935zze);
        zzbf zzbfVar = zzbcVar.f46936zzf;
        zzbe zzbeVar = new zzbe(zzbfVar);
        while (zzbeVar.hasNext()) {
            String next = zzbeVar.next();
            com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
            zzhpVarZze.zzj(next);
            Object objZzf = zzbfVar.zzf(next);
            Preconditions.checkNotNull(objZzf);
            zzw(zzhpVarZze, objZzf);
            zzhlVarZze.zze(zzhpVarZze);
        }
        String str = zzbcVar.f46933zzc;
        if (!TextUtils.isEmpty(str) && zzbfVar.zzf("_o") == null) {
            com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
            zzhpVarZze2.zzj("_o");
            zzhpVarZze2.zzk(str);
            zzhlVarZze.zzf((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze2.zzba());
        }
        return (com.google.android.gms.internal.measurement.zzhm) zzhlVarZze.zzba();
    }

    public final String zzq(com.google.android.gms.internal.measurement.zzhv zzhvVar) {
        com.google.android.gms.internal.measurement.zzhg zzhgVarZzx;
        if (zzhvVar == null) {
            return "";
        }
        StringBuilder sbS = p.a.s("\nbatch {\n");
        if (zzhvVar.zzq()) {
            zzQ(sbS, 0, "upload_subdomain", zzhvVar.zzg());
        }
        if (zzhvVar.zzp()) {
            zzQ(sbS, 0, "sgtm_join_id", zzhvVar.zzf());
        }
        for (com.google.android.gms.internal.measurement.zzhx zzhxVar : zzhvVar.zzh()) {
            if (zzhxVar != null) {
                zzL(sbS, 1);
                sbS.append("bundle {\n");
                if (zzhxVar.zzbQ()) {
                    zzQ(sbS, 1, "protocol_version", Integer.valueOf(zzhxVar.zzf()));
                }
                zzrd.zzb();
                zzio zzioVar = this.zzu;
                if (zzioVar.zzf().zzx(zzhxVar.zzF(), zzgi.zzaL) && zzhxVar.zzbT()) {
                    zzQ(sbS, 1, "session_stitching_token", zzhxVar.zzU());
                }
                zzQ(sbS, 1, "platform", zzhxVar.zzS());
                if (zzhxVar.zzbL()) {
                    zzQ(sbS, 1, "gmp_version", Long.valueOf(zzhxVar.zzp()));
                }
                if (zzhxVar.zzbZ()) {
                    zzQ(sbS, 1, "uploading_gmp_version", Long.valueOf(zzhxVar.zzv()));
                }
                if (zzhxVar.zzbJ()) {
                    zzQ(sbS, 1, "dynamite_version", Long.valueOf(zzhxVar.zzn()));
                }
                if (zzhxVar.zzbC()) {
                    zzQ(sbS, 1, "config_version", Long.valueOf(zzhxVar.zzk()));
                }
                zzQ(sbS, 1, "gmp_app_id", zzhxVar.zzP());
                zzQ(sbS, 1, "admob_app_id", zzhxVar.zzE());
                zzQ(sbS, 1, "app_id", zzhxVar.zzF());
                zzQ(sbS, 1, "app_version", zzhxVar.zzI());
                if (zzhxVar.zzby()) {
                    zzQ(sbS, 1, "app_version_major", Integer.valueOf(zzhxVar.zzb()));
                }
                zzQ(sbS, 1, "firebase_instance_id", zzhxVar.zzO());
                if (zzhxVar.zzbH()) {
                    zzQ(sbS, 1, "dev_cert_hash", Long.valueOf(zzhxVar.zzm()));
                }
                zzQ(sbS, 1, "app_store", zzhxVar.zzH());
                if (zzhxVar.zzbY()) {
                    zzQ(sbS, 1, "upload_timestamp_millis", Long.valueOf(zzhxVar.zzu()));
                }
                if (zzhxVar.zzbV()) {
                    zzQ(sbS, 1, "start_timestamp_millis", Long.valueOf(zzhxVar.zzs()));
                }
                if (zzhxVar.zzbK()) {
                    zzQ(sbS, 1, "end_timestamp_millis", Long.valueOf(zzhxVar.zzo()));
                }
                if (zzhxVar.zzbP()) {
                    zzQ(sbS, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzhxVar.zzr()));
                }
                if (zzhxVar.zzbO()) {
                    zzQ(sbS, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzhxVar.zzq()));
                }
                zzQ(sbS, 1, "app_instance_id", zzhxVar.zzG());
                zzQ(sbS, 1, "resettable_device_id", zzhxVar.zzT());
                zzQ(sbS, 1, "ds_id", zzhxVar.zzN());
                if (zzhxVar.zzbN()) {
                    zzQ(sbS, 1, "limited_ad_tracking", Boolean.valueOf(zzhxVar.zzbv()));
                }
                zzQ(sbS, 1, "os_version", zzhxVar.zzR());
                zzQ(sbS, 1, "device_model", zzhxVar.zzM());
                zzQ(sbS, 1, "user_default_language", zzhxVar.zzV());
                if (zzhxVar.zzbX()) {
                    zzQ(sbS, 1, "time_zone_offset_minutes", Integer.valueOf(zzhxVar.zzh()));
                }
                if (zzhxVar.zzbB()) {
                    zzQ(sbS, 1, "bundle_sequential_index", Integer.valueOf(zzhxVar.zzc()));
                }
                if (zzhxVar.zzbG()) {
                    zzQ(sbS, 1, "delivery_index", Integer.valueOf(zzhxVar.zzd()));
                }
                if (zzhxVar.zzbS()) {
                    zzQ(sbS, 1, "service_upload", Boolean.valueOf(zzhxVar.zzbw()));
                }
                zzQ(sbS, 1, "health_monitor", zzhxVar.zzQ());
                if (zzhxVar.zzbR()) {
                    zzQ(sbS, 1, "retry_counter", Integer.valueOf(zzhxVar.zzg()));
                }
                if (zzhxVar.zzbE()) {
                    zzQ(sbS, 1, "consent_signals", zzhxVar.zzK());
                }
                if (zzhxVar.zzbM()) {
                    zzQ(sbS, 1, "is_dma_region", Boolean.valueOf(zzhxVar.zzbu()));
                }
                if (zzhxVar.zzbF()) {
                    zzQ(sbS, 1, "core_platform_services", zzhxVar.zzL());
                }
                if (zzhxVar.zzbD()) {
                    zzQ(sbS, 1, "consent_diagnostics", zzhxVar.zzJ());
                }
                if (zzhxVar.zzbW()) {
                    zzQ(sbS, 1, "target_os_version", Long.valueOf(zzhxVar.zzt()));
                }
                zzqr.zzb();
                if (zzioVar.zzf().zzx(zzhxVar.zzF(), zzgi.zzaV)) {
                    zzQ(sbS, 1, "ad_services_version", Integer.valueOf(zzhxVar.zza()));
                    if (zzhxVar.zzbz() && (zzhgVarZzx = zzhxVar.zzx()) != null) {
                        zzL(sbS, 2);
                        sbS.append("attribution_eligibility_status {\n");
                        zzQ(sbS, 2, "eligible", Boolean.valueOf(zzhgVarZzx.zzn()));
                        zzQ(sbS, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzhgVarZzx.zzp()));
                        zzQ(sbS, 2, "pre_r", Boolean.valueOf(zzhgVarZzx.zzq()));
                        zzQ(sbS, 2, "r_extensions_too_old", Boolean.valueOf(zzhgVarZzx.zzr()));
                        zzQ(sbS, 2, "adservices_extension_too_old", Boolean.valueOf(zzhgVarZzx.zzm()));
                        zzQ(sbS, 2, "ad_storage_not_allowed", Boolean.valueOf(zzhgVarZzx.zzk()));
                        zzQ(sbS, 2, "measurement_manager_disabled", Boolean.valueOf(zzhgVarZzx.zzo()));
                        zzL(sbS, 2);
                        sbS.append("}\n");
                    }
                }
                if (zzhxVar.zzbx()) {
                    com.google.android.gms.internal.measurement.zzhc zzhcVarZzw = zzhxVar.zzw();
                    zzL(sbS, 2);
                    sbS.append("ad_campaign_info {\n");
                    if (zzhcVarZzw.zzC()) {
                        zzQ(sbS, 2, "deep_link_gclid", zzhcVarZzw.zzh());
                    }
                    if (zzhcVarZzw.zzB()) {
                        zzQ(sbS, 2, "deep_link_gbraid", zzhcVarZzw.zzg());
                    }
                    if (zzhcVarZzw.zzA()) {
                        zzQ(sbS, 2, "deep_link_gad_source", zzhcVarZzw.zzf());
                    }
                    if (zzhcVarZzw.zzD()) {
                        zzQ(sbS, 2, "deep_link_session_millis", Long.valueOf(zzhcVarZzw.zza()));
                    }
                    if (zzhcVarZzw.zzH()) {
                        zzQ(sbS, 2, "market_referrer_gclid", zzhcVarZzw.zzk());
                    }
                    if (zzhcVarZzw.zzG()) {
                        zzQ(sbS, 2, "market_referrer_gbraid", zzhcVarZzw.zzj());
                    }
                    if (zzhcVarZzw.zzF()) {
                        zzQ(sbS, 2, "market_referrer_gad_source", zzhcVarZzw.zzi());
                    }
                    if (zzhcVarZzw.zzE()) {
                        zzQ(sbS, 2, "market_referrer_click_millis", Long.valueOf(zzhcVarZzw.zzb()));
                    }
                    zzL(sbS, 2);
                    sbS.append("}\n");
                }
                if (zzhxVar.zzbA()) {
                    zzQ(sbS, 1, "batching_timestamp_millis", Long.valueOf(zzhxVar.zzj()));
                }
                if (zzhxVar.zzbU()) {
                    com.google.android.gms.internal.measurement.zzim zzimVarZzC = zzhxVar.zzC();
                    zzL(sbS, 2);
                    sbS.append("sgtm_diagnostics {\n");
                    int iZzg = zzimVarZzC.zzg();
                    zzQ(sbS, 2, "upload_type", iZzg != 1 ? iZzg != 2 ? iZzg != 3 ? iZzg != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    zzQ(sbS, 2, "client_upload_eligibility", zzimVarZzC.zzb().name());
                    int iZzf = zzimVarZzC.zzf();
                    zzQ(sbS, 2, "service_upload_eligibility", iZzf != 1 ? iZzf != 2 ? iZzf != 3 ? iZzf != 4 ? iZzf != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    zzL(sbS, 2);
                    sbS.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.zzio> listZzY = zzhxVar.zzY();
                if (listZzY != null) {
                    for (com.google.android.gms.internal.measurement.zzio zzioVar2 : listZzY) {
                        if (zzioVar2 != null) {
                            zzL(sbS, 2);
                            sbS.append("user_property {\n");
                            zzQ(sbS, 2, "set_timestamp_millis", zzioVar2.zzu() ? Long.valueOf(zzioVar2.zzd()) : null);
                            zzQ(sbS, 2, "name", zzioVar.zzj().zzf(zzioVar2.zzg()));
                            zzQ(sbS, 2, "string_value", zzioVar2.zzh());
                            zzQ(sbS, 2, "int_value", zzioVar2.zzt() ? Long.valueOf(zzioVar2.zzc()) : null);
                            zzQ(sbS, 2, "double_value", zzioVar2.zzr() ? Double.valueOf(zzioVar2.zza()) : null);
                            zzL(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhi> listZzW = zzhxVar.zzW();
                if (listZzW != null) {
                    for (com.google.android.gms.internal.measurement.zzhi zzhiVar : listZzW) {
                        if (zzhiVar != null) {
                            zzL(sbS, 2);
                            sbS.append("audience_membership {\n");
                            if (zzhiVar.zzk()) {
                                zzQ(sbS, 2, "audience_id", Integer.valueOf(zzhiVar.zza()));
                            }
                            if (zzhiVar.zzm()) {
                                zzQ(sbS, 2, "new_audience", Boolean.valueOf(zzhiVar.zzj()));
                            }
                            zzP(sbS, 2, "current_data", zzhiVar.zzd());
                            if (zzhiVar.zzn()) {
                                zzP(sbS, 2, "previous_data", zzhiVar.zze());
                            }
                            zzL(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhm> listZzX = zzhxVar.zzX();
                if (listZzX != null) {
                    for (com.google.android.gms.internal.measurement.zzhm zzhmVar : listZzX) {
                        if (zzhmVar != null) {
                            zzL(sbS, 2);
                            sbS.append("event {\n");
                            zzQ(sbS, 2, "name", zzioVar.zzj().zzd(zzhmVar.zzh()));
                            if (zzhmVar.zzu()) {
                                zzQ(sbS, 2, "timestamp_millis", Long.valueOf(zzhmVar.zzd()));
                            }
                            if (zzhmVar.zzt()) {
                                zzQ(sbS, 2, "previous_timestamp_millis", Long.valueOf(zzhmVar.zzc()));
                            }
                            if (zzhmVar.zzs()) {
                                zzQ(sbS, 2, "count", Integer.valueOf(zzhmVar.zza()));
                            }
                            if (zzhmVar.zzb() != 0) {
                                zzJ(sbS, 2, zzhmVar.zzi());
                            }
                            zzL(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                zzL(sbS, 1);
                sbS.append("}\n");
            }
        }
        sbS.append("} // End-of-batch\n");
        return sbS.toString();
    }

    public final String zzr(com.google.android.gms.internal.measurement.zzfj zzfjVar) {
        if (zzfjVar == null) {
            return "null";
        }
        StringBuilder sbS = p.a.s("\nevent_filter {\n");
        if (zzfjVar.zzp()) {
            zzQ(sbS, 0, "filter_id", Integer.valueOf(zzfjVar.zzb()));
        }
        zzQ(sbS, 0, "event_name", this.zzu.zzj().zzd(zzfjVar.zzg()));
        String strZzN = zzN(zzfjVar.zzk(), zzfjVar.zzm(), zzfjVar.zzn());
        if (!strZzN.isEmpty()) {
            zzQ(sbS, 0, "filter_type", strZzN);
        }
        if (zzfjVar.zzo()) {
            zzR(sbS, 1, "event_count_filter", zzfjVar.zzf());
        }
        if (zzfjVar.zza() > 0) {
            sbS.append("  filters {\n");
            Iterator it8 = zzfjVar.zzh().iterator();
            while (it8.hasNext()) {
                zzK(sbS, 2, (com.google.android.gms.internal.measurement.zzfl) it8.next());
            }
        }
        zzL(sbS, 1);
        sbS.append("}\n}\n");
        return sbS.toString();
    }

    public final String zzs(com.google.android.gms.internal.measurement.zzfr zzfrVar) {
        if (zzfrVar == null) {
            return "null";
        }
        StringBuilder sbS = p.a.s("\nproperty_filter {\n");
        if (zzfrVar.zzj()) {
            zzQ(sbS, 0, "filter_id", Integer.valueOf(zzfrVar.zza()));
        }
        zzQ(sbS, 0, "property_name", this.zzu.zzj().zzf(zzfrVar.zze()));
        String strZzN = zzN(zzfrVar.zzg(), zzfrVar.zzh(), zzfrVar.zzi());
        if (!strZzN.isEmpty()) {
            zzQ(sbS, 0, "filter_type", strZzN);
        }
        zzK(sbS, 1, zzfrVar.zzb());
        sbS.append("}\n");
        return sbS.toString();
    }

    public final List zzt(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            Integer num = (Integer) it8.next();
            if (num.intValue() < 0) {
                this.zzu.zzaW().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaW().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final Map zzv(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj2 = bundle.get(str);
            boolean z3 = obj2 instanceof Parcelable[];
            if (z3 || (obj2 instanceof ArrayList) || (obj2 instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z3) {
                        for (Parcelable parcelable : (Parcelable[]) obj2) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzv((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj2;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj3 = arrayList2.get(i);
                            if (obj3 instanceof Bundle) {
                                arrayList.add(zzv((Bundle) obj3, false));
                            }
                        }
                    } else if (obj2 instanceof Bundle) {
                        arrayList.add(zzv((Bundle) obj2, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj2 != null) {
                map.put(str, obj2);
            }
        }
        return map;
    }

    public final void zzw(com.google.android.gms.internal.measurement.zzhp zzhpVar, Object obj2) {
        Preconditions.checkNotNull(obj2);
        zzhpVar.zzg();
        zzhpVar.zze();
        zzhpVar.zzd();
        zzhpVar.zzf();
        if (obj2 instanceof String) {
            zzhpVar.zzk((String) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            zzhpVar.zzi(((Long) obj2).longValue());
            return;
        }
        if (obj2 instanceof Double) {
            zzhpVar.zzh(((Double) obj2).doubleValue());
            return;
        }
        if (!(obj2 instanceof Bundle[])) {
            this.zzu.zzaW().zze().zzb("Ignoring invalid (type) event param value", obj2);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj2) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhp zzhpVarZze = com.google.android.gms.internal.measurement.zzhq.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhp zzhpVarZze2 = com.google.android.gms.internal.measurement.zzhq.zze();
                    zzhpVarZze2.zzj(str);
                    Object obj3 = bundle.get(str);
                    if (obj3 instanceof Long) {
                        zzhpVarZze2.zzi(((Long) obj3).longValue());
                    } else if (obj3 instanceof String) {
                        zzhpVarZze2.zzk((String) obj3);
                    } else if (obj3 instanceof Double) {
                        zzhpVarZze2.zzh(((Double) obj3).doubleValue());
                    }
                    zzhpVarZze.zzc(zzhpVarZze2);
                }
                if (zzhpVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhq) zzhpVarZze.zzba());
                }
            }
        }
        zzhpVar.zzb(arrayList);
    }

    public final void zzx(com.google.android.gms.internal.measurement.zzin zzinVar, Object obj2) {
        Preconditions.checkNotNull(obj2);
        zzinVar.zzc();
        zzinVar.zzb();
        zzinVar.zza();
        if (obj2 instanceof String) {
            zzinVar.zzh((String) obj2);
            return;
        }
        if (obj2 instanceof Long) {
            zzinVar.zze(((Long) obj2).longValue());
        } else if (obj2 instanceof Double) {
            zzinVar.zzd(((Double) obj2).doubleValue());
        } else {
            this.zzu.zzaW().zze().zzb("Ignoring invalid (type) user attribute value", obj2);
        }
    }

    public final boolean zzz(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.zzu.zzaU().currentTimeMillis() - j2) > j3;
    }
}
