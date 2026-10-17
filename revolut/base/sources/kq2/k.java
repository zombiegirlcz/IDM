package kq2;

/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private k() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static l a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2146961825:
                    if (str.equals("LOCAL_TRANSFER")) {
                        return l.LOCAL_TRANSFER;
                    }
                    break;
                case -1621270590:
                    if (str.equals("SWIFT_NON_USD_TRANSFER")) {
                        return l.SWIFT_NON_USD_TRANSFER;
                    }
                    break;
                case -1112762241:
                    if (str.equals("CROSS_BORDER_TRANSFER")) {
                        return l.CROSS_BORDER_TRANSFER;
                    }
                    break;
                case -519345808:
                    if (str.equals("SWIFT_USD_TRANSFER")) {
                        return l.SWIFT_USD_TRANSFER;
                    }
                    break;
                case 509128348:
                    if (str.equals("INTERNATIONAL_TRANSFER")) {
                        return l.INTERNATIONAL_TRANSFER;
                    }
                    break;
            }
        }
        return l.LOCAL_TRANSFER;
    }
}
