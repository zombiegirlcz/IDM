package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.asn1.eac.CertificateBody;
import ve.b;
import ve.c;
import ve.d;
import ve.e;

/* JADX INFO: loaded from: classes.dex */
final class zzfi implements d {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Charset f41400zza = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final b f41401zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static final b f41402zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final c f41403zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private OutputStream f41404zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Map f41405zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Map f41406zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final c f41407zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzfm f41408zzi = new zzfm(this);

    static {
        zzfg zzfgVarD = a0.d.d(1);
        HashMap map = new HashMap();
        map.put(zzfgVarD.annotationType(), zzfgVarD);
        f41401zzb = new b("key", v0.a.r(map));
        zzfg zzfgVarD2 = a0.d.d(2);
        HashMap map2 = new HashMap();
        map2.put(zzfgVarD2.annotationType(), zzfgVarD2);
        f41402zzc = new b("value", v0.a.r(map2));
        f41403zzd = new c() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzfh
            @Override // ve.a
            public final void encode(Object obj2, Object obj3) throws IOException {
                zzfi.zzg((Map.Entry) obj2, (d) obj3);
            }
        };
    }

    public zzfi(OutputStream outputStream, Map map, Map map2, c cVar) {
        this.f41404zze = outputStream;
        this.f41405zzf = map;
        this.f41406zzg = map2;
        this.f41407zzh = cVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, d dVar) throws IOException {
        dVar.add(f41401zzb, entry.getKey());
        dVar.add(f41402zzc, entry.getValue());
    }

    private static int zzh(b bVar) {
        zzfg zzfgVar = (zzfg) bVar.b(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(c cVar, Object obj2) throws IOException {
        zzfd zzfdVar = new zzfd();
        try {
            OutputStream outputStream = this.f41404zze;
            this.f41404zze = zzfdVar;
            try {
                cVar.encode(obj2, this);
                this.f41404zze = outputStream;
                long jZza = zzfdVar.zza();
                zzfdVar.close();
                return jZza;
            } catch (Throwable th10) {
                this.f41404zze = outputStream;
                throw th10;
            }
        } catch (Throwable th11) {
            try {
                zzfdVar.close();
            } catch (Throwable th12) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th11, th12);
                } catch (Exception unused) {
                }
            }
            throw th11;
        }
    }

    private static zzfg zzj(b bVar) {
        zzfg zzfgVar = (zzfg) bVar.b(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzfi zzk(c cVar, b bVar, Object obj2, boolean z) throws IOException {
        long jZzi = zzi(cVar, obj2);
        if (z && jZzi == 0) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 2);
        zzo(jZzi);
        cVar.encode(obj2, this);
        return this;
    }

    private final zzfi zzl(e eVar, b bVar, Object obj2, boolean z) throws IOException {
        this.f41408zzi.zza(bVar, z);
        eVar.encode(obj2, this.f41408zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) throws IOException {
        while ((i & RangingPosition.RSSI_UNKNOWN) != 0) {
            this.f41404zze.write((i & CertificateBody.profileType) | 128);
            i >>>= 7;
        }
        this.f41404zze.write(i & CertificateBody.profileType);
    }

    private final void zzo(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            this.f41404zze.write((((int) j2) & CertificateBody.profileType) | 128);
            j2 >>>= 7;
        }
        this.f41404zze.write(((int) j2) & CertificateBody.profileType);
    }

    @Override // ve.d
    @NonNull
    public final d add(@NonNull b bVar, double d) throws IOException {
        zza(bVar, d, true);
        return this;
    }

    @NonNull
    public final d inline(Object obj2) throws IOException {
        zzf(obj2);
        return this;
    }

    @NonNull
    public final d nested(@NonNull b bVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final d zza(@NonNull b bVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 1);
        this.f41404zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    public final d zzb(@NonNull b bVar, float f, boolean z) throws IOException {
        if (z && f == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 5);
        this.f41404zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final d zzc(@NonNull b bVar, Object obj2, boolean z) throws IOException {
        if (obj2 != null) {
            if (obj2 instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj2;
                if (!z || charSequence.length() != 0) {
                    zzn((zzh(bVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f41400zza);
                    zzn(bytes.length);
                    this.f41404zze.write(bytes);
                    return this;
                }
            } else if (obj2 instanceof Collection) {
                Iterator it8 = ((Collection) obj2).iterator();
                while (it8.hasNext()) {
                    zzc(bVar, it8.next(), false);
                }
            } else if (obj2 instanceof Map) {
                Iterator it9 = ((Map) obj2).entrySet().iterator();
                while (it9.hasNext()) {
                    zzk(f41403zzd, bVar, (Map.Entry) it9.next(), false);
                }
            } else {
                if (obj2 instanceof Double) {
                    zza(bVar, ((Double) obj2).doubleValue(), z);
                    return this;
                }
                if (obj2 instanceof Float) {
                    zzb(bVar, ((Float) obj2).floatValue(), z);
                    return this;
                }
                if (obj2 instanceof Number) {
                    zze(bVar, ((Number) obj2).longValue(), z);
                    return this;
                }
                if (obj2 instanceof Boolean) {
                    zzd(bVar, ((Boolean) obj2).booleanValue() ? 1 : 0, z);
                    return this;
                }
                if (!(obj2 instanceof byte[])) {
                    c cVar = (c) this.f41405zzf.get(obj2.getClass());
                    if (cVar != null) {
                        zzk(cVar, bVar, obj2, z);
                        return this;
                    }
                    e eVar = (e) this.f41406zzg.get(obj2.getClass());
                    if (eVar != null) {
                        zzl(eVar, bVar, obj2, z);
                        return this;
                    }
                    if (obj2 instanceof zzfe) {
                        zzd(bVar, ((zzfe) obj2).zza(), true);
                        return this;
                    }
                    if (obj2 instanceof Enum) {
                        zzd(bVar, ((Enum) obj2).ordinal(), true);
                        return this;
                    }
                    zzk(this.f41407zzh, bVar, obj2, z);
                    return this;
                }
                byte[] bArr = (byte[]) obj2;
                if (!z || bArr.length != 0) {
                    zzn((zzh(bVar) << 3) | 2);
                    zzn(bArr.length);
                    this.f41404zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    public final zzfi zzd(@NonNull b bVar, int i, boolean z) throws IOException {
        if (!z || i != 0) {
            zzfg zzfgVarZzj = zzj(bVar);
            zzff zzffVar = zzff.DEFAULT;
            int iOrdinal = zzfgVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzfgVarZzj.zza() << 3);
                zzn(i);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzfgVarZzj.zza() << 3);
                zzn((i + i) ^ (i >> 31));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzfgVarZzj.zza() << 3) | 5);
                this.f41404zze.write(zzm(4).putInt(i).array());
                return this;
            }
        }
        return this;
    }

    public final zzfi zze(@NonNull b bVar, long j2, boolean z) throws IOException {
        if (!z || j2 != 0) {
            zzfg zzfgVarZzj = zzj(bVar);
            zzff zzffVar = zzff.DEFAULT;
            int iOrdinal = zzfgVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzfgVarZzj.zza() << 3);
                zzo(j2);
                return this;
            }
            if (iOrdinal == 1) {
                zzn(zzfgVarZzj.zza() << 3);
                zzo((j2 >> 63) ^ (j2 + j2));
                return this;
            }
            if (iOrdinal == 2) {
                zzn((zzfgVarZzj.zza() << 3) | 1);
                this.f41404zze.write(zzm(8).putLong(j2).array());
                return this;
            }
        }
        return this;
    }

    public final zzfi zzf(Object obj2) throws IOException {
        if (obj2 == null) {
            return this;
        }
        c cVar = (c) this.f41405zzf.get(obj2.getClass());
        if (cVar == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj2.getClass())));
        }
        cVar.encode(obj2, this);
        return this;
    }

    @NonNull
    public final d add(@NonNull b bVar, float f) throws IOException {
        zzb(bVar, f, true);
        return this;
    }

    @Override // ve.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, int i) throws IOException {
        zzd(bVar, i, true);
        return this;
    }

    @Override // ve.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, long j2) throws IOException {
        zze(bVar, j2, true);
        return this;
    }

    @NonNull
    public final d nested(@NonNull String str) throws IOException {
        return nested(b.c(str));
    }

    @Override // ve.d
    @NonNull
    public final d add(@NonNull b bVar, Object obj2) throws IOException {
        zzc(bVar, obj2, true);
        return this;
    }

    @Override // ve.d
    @NonNull
    public final /* synthetic */ d add(@NonNull b bVar, boolean z) throws IOException {
        zzd(bVar, z ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, double d) throws IOException {
        zza(b.c(str), d, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, int i) throws IOException {
        zzd(b.c(str), i, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, long j2) throws IOException {
        zze(b.c(str), j2, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, Object obj2) throws IOException {
        zzc(b.c(str), obj2, true);
        return this;
    }

    @NonNull
    public final d add(@NonNull String str, boolean z) throws IOException {
        zzd(b.c(str), z ? 1 : 0, true);
        return this;
    }
}
