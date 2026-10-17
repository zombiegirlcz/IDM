package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzme {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static File f45450zza;

    public static Payload zza(Context context, zzmc zzmcVar) {
        long jZzb = zzmcVar.zzb();
        int iZza = zzmcVar.zza();
        if (iZza == 1) {
            zzly zzlyVarZzg = zzmcVar.zzg();
            byte[] bArrZzc = zzlyVarZzg != null ? zzlyVarZzg.zzc() : zzmcVar.zzv();
            zztq.zzc(bArrZzc, "Payload bytes cannot be null if type is BYTES.");
            return Payload.zza(bArrZzc, jZzb);
        }
        if (iZza != 2) {
            if (iZza != 3) {
                String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(zzmcVar.zzb()), Integer.valueOf(zzmcVar.zza()));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptorZze = zzmcVar.zze();
            zztq.zzc(parcelFileDescriptorZze, "Data ParcelFileDescriptor cannot be null for type STREAM");
            return Payload.zzc(Payload.Stream.zzb(parcelFileDescriptorZze), jZzb);
        }
        String strZzh = zzmcVar.zzh();
        Uri uriZzd = zzmcVar.zzd();
        if (strZzh == null || uriZzd == null) {
            ParcelFileDescriptor parcelFileDescriptorZze2 = zzmcVar.zze();
            zztq.zzc(parcelFileDescriptorZze2, "Data ParcelFileDescriptor cannot be null for type FILE");
            return Payload.zzb(Payload.File.zzb(parcelFileDescriptorZze2), jZzb);
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriZzd, "r");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return Payload.zzb(Payload.File.zza(new File(strZzh), parcelFileDescriptorOpenFileDescriptor, zzmcVar.zzc(), uriZzd), jZzb);
            }
            String.format("Failed to get ParcelFileDescriptor for %s", uriZzd);
            return null;
        } catch (FileNotFoundException e) {
            String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uriZzd, strZzh);
            return null;
        } catch (SecurityException e2) {
            String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uriZzd, strZzh);
            return null;
        }
    }

    public static File zzb() {
        return f45450zza;
    }

    public static void zzc(File file) {
        if (file == null) {
            return;
        }
        f45450zza = file;
    }
}
