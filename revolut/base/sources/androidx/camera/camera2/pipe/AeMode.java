package androidx.camera.camera2.pipe;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/AeMode;", "", "", "value", "constructor-impl", "(I)I", "", "isOn-impl", "(I)Z", "isOn", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "getValue", "()I", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AeMode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int OFF;
    private static final int ON;
    private static final int ON_ALWAYS_FLASH;
    private static final int ON_AUTO_FLASH;
    private static final int ON_AUTO_FLASH_REDEYE;
    private static final int ON_EXTERNAL_FLASH;
    private static final int ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY;

    @NotNull
    private static final List<AeMode> values;
    private final int value;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/AeMode$Companion;", "", "<init>", "()V", "", "value", "Landroidx/camera/camera2/pipe/AeMode;", "fromIntOrNull-kQd0u18", "(I)Landroidx/camera/camera2/pipe/AeMode;", "fromIntOrNull", "OFF", "I", "getOFF-bOjpiJc", "()I", "ON", "getON-bOjpiJc", "", "values", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
        public final AeMode m71fromIntOrNullkQd0u18(int value) {
            Object next;
            Iterator<T> it8 = getValues().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((AeMode) next).getValue() == value) {
                    break;
                }
            }
            return (AeMode) next;
        }

        /* JADX INFO: renamed from: getOFF-bOjpiJc, reason: not valid java name */
        public final int m72getOFFbOjpiJc() {
            return AeMode.OFF;
        }

        /* JADX INFO: renamed from: getON-bOjpiJc, reason: not valid java name */
        public final int m73getONbOjpiJc() {
            return AeMode.ON;
        }

        @NotNull
        public final List<AeMode> getValues() {
            return AeMode.values;
        }

        private Companion() {
        }
    }

    static {
        int iM64constructorimpl = m64constructorimpl(0);
        OFF = iM64constructorimpl;
        int iM64constructorimpl2 = m64constructorimpl(1);
        ON = iM64constructorimpl2;
        int iM64constructorimpl3 = m64constructorimpl(3);
        ON_ALWAYS_FLASH = iM64constructorimpl3;
        int iM64constructorimpl4 = m64constructorimpl(2);
        ON_AUTO_FLASH = iM64constructorimpl4;
        int iM64constructorimpl5 = m64constructorimpl(4);
        ON_AUTO_FLASH_REDEYE = iM64constructorimpl5;
        int iM64constructorimpl6 = m64constructorimpl(5);
        ON_EXTERNAL_FLASH = iM64constructorimpl6;
        int iM64constructorimpl7 = m64constructorimpl(6);
        ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY = iM64constructorimpl7;
        values = v.k(m63boximpl(iM64constructorimpl), m63boximpl(iM64constructorimpl2), m63boximpl(iM64constructorimpl4), m63boximpl(iM64constructorimpl3), m63boximpl(iM64constructorimpl5), m63boximpl(iM64constructorimpl6), m63boximpl(iM64constructorimpl7));
    }

    private /* synthetic */ AeMode(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AeMode m63boximpl(int i) {
        return new AeMode(i);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m64constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m65equalsimpl(int i, Object obj2) {
        return (obj2 instanceof AeMode) && i == ((AeMode) obj2).getValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m66equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m67hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m68isOnimpl(int i) {
        return i != 0;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m69toStringimpl(int i) {
        return a.k(CoreConstants.RIGHT_PARENTHESIS_CHAR, "AeMode(value=", i);
    }

    public boolean equals(Object obj2) {
        return m65equalsimpl(this.value, obj2);
    }

    public int hashCode() {
        return m67hashCodeimpl(this.value);
    }

    public String toString() {
        return m69toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
