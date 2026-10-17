package b9;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13308b;

    static {
        int[] iArr = new int[l.values().length];
        f13308b = iArr;
        try {
            iArr[l.first_child.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13308b[l.last_child.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13308b[l.only_child.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f13308b[l.first_of_type.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f13308b[l.last_of_type.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f13308b[l.only_of_type.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f13308b[l.root.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f13308b[l.empty.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f13308b[l.nth_child.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f13308b[l.nth_last_child.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f13308b[l.nth_of_type.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f13308b[l.nth_last_of_type.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f13308b[l.not.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f13308b[l.target.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f13308b[l.lang.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f13308b[l.link.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f13308b[l.visited.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f13308b[l.hover.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f13308b[l.active.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f13308b[l.focus.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f13308b[l.enabled.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f13308b[l.disabled.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f13308b[l.checked.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f13308b[l.indeterminate.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        int[] iArr2 = new int[d.values().length];
        f13307a = iArr2;
        try {
            iArr2[d.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            f13307a[d.INCLUDES.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            f13307a[d.DASHMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
    }
}
