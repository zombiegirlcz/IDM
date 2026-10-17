package com.google.android.gms.internal.play_billing;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
final class zzhz {
    public static String zza(zzev zzevVar) {
        StringBuilder sb6 = new StringBuilder(zzevVar.zze());
        for (int i = 0; i < zzevVar.zze(); i++) {
            byte bZza = zzevVar.zza(i);
            if (bZza == 34) {
                sb6.append("\\\"");
            } else if (bZza == 39) {
                sb6.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb6.append("\\a");
                        break;
                    case 8:
                        sb6.append("\\b");
                        break;
                    case 9:
                        sb6.append("\\t");
                        break;
                    case 10:
                        sb6.append("\\n");
                        break;
                    case 11:
                        sb6.append("\\v");
                        break;
                    case 12:
                        sb6.append("\\f");
                        break;
                    case 13:
                        sb6.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb6.append(CoreConstants.ESCAPE_CHAR);
                            sb6.append((char) (((bZza >>> 6) & 3) + 48));
                            sb6.append((char) (((bZza >>> 3) & 7) + 48));
                            sb6.append((char) ((bZza & 7) + 48));
                        } else {
                            sb6.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb6.append("\\\\");
            }
        }
        return sb6.toString();
    }
}
