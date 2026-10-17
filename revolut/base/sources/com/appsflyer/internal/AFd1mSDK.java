package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1mSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFInAppEventParameterName = 0;
    private static char[] AFInAppEventType = null;
    private static int registerClient = 1;
    private static int valueOf;
    private final Context AFKeystoreWrapper;
    private final Map<String, Object> values;

    public static class AFa1zSDK {
        public static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        public static byte[] values(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        AFInAppEventType();
        AndroidCharacter.getMirror('0');
        ViewConfiguration.getGlobalActionKeyTimeout();
        ViewConfiguration.getZoomControlsTimeout();
        int i = valueOf + 19;
        registerClient = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public AFd1mSDK(Map<String, Object> map, Context context) {
        this.values = map;
        this.AFKeystoreWrapper = context;
        put(AFInAppEventParameterName(), valueOf());
    }

    @NonNull
    private String AFInAppEventParameterName() throws UnsupportedEncodingException {
        valueOf = (registerClient + 95) % 128;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.values;
            Object[] objArr = new Object[1];
            a(false, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.values;
            Object[] objArr2 = new Object[1];
            b("퉹殴ꇀ￢㔋", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 47581, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                valueOf = (registerClient + 113) % 128;
                Object[] objArr3 = new Object[1];
                b("퉕柷뤂\uf2b0Ӆ幵鎇┪", 46499 - TextUtils.indexOf("", "", 0), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb6 = new StringBuilder(string2);
            sb6.reverse();
            StringBuilder sbAFKeystoreWrapper = AFKeystoreWrapper(string, string3, sb6.toString());
            int length = sbAFKeystoreWrapper.length();
            if (length > 4) {
                valueOf = (registerClient + ISO781611.SMT_TAG) % 128;
                sbAFKeystoreWrapper.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    sbAFKeystoreWrapper.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b("퉰軃欇", 23741 - KeyEvent.getDeadChar(0, 0), objArr4);
            sbAFKeystoreWrapper.insert(0, ((String) objArr4[0]).intern());
            return sbAFKeystoreWrapper.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            a(true, new int[]{12, 40, 0, 8}, "\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b("퉽\u1ccd伜빒\ue8a2\udbecੱ畽Ᶎ阚션㎴拮괤鱰컌㤌栜媮藫\uf431✸ᇊ䀏덊\ufde4⳺Ἷ乫룈\ueb49\uda57҃矯\ua630酮쏓㈁絞꾔麹쥴", TextUtils.indexOf("", "", 0) + 52919, objArr6);
            sb9.append(((String) objArr6[0]).intern());
            sb9.append(e);
            AFLogger.afRDLog(sb9.toString());
            Object[] objArr7 = new Object[1];
            a(true, new int[]{52, 7, 0, 7}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000", objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    public static void AFInAppEventType() {
        AFInAppEventType = new char[]{4590, 4541, 4540, 4535, 4528, 4533, 4535, 4530, 4525, 4532, 4537, 4528, 4588, 4486, 4576, 4506, 4539, 4530, 4536, 4509, 4506, 4528, 4528, 4526, 4501, 4498, 4529, 4534, 4507, 4509, 4539, 4534, 4507, 4509, 4532, 4533, 4528, 4532, 4535, 4533, 4535, 4535, 4536, 4509, 4508, 4538, 4534, 4532, 4539, 4541, 4509, 4498, 4546, 4583, 4583, 4583, 4497, 4539, 4534, 4543, 4373, 4371, 4376, 4374, 4368, 4365, 4362, 4383, 4457, 4370, 4364, 4375, 4376, 4457, 4489, 4467, 4464, 4465, 4466, 4465, 4515, 4390, 4392, 4392, 4412, 4375, 4379, 4376, 4415, 4414, 4372, 4413, 4353, 4377, 4375, 4377, 4353, 4390, 4594, 4487, 4485, 4481, 4482, 4487, 4484, 4536, 4527, 4532, 4542, 4543, 4535, 4481, 4488, 4499, 4541, 4445, 4447, 4445, 4446, 4521, 4482, 4536, 4440, 4512, 4447, 4440, 4446, 4542, 4480, 4517, 4447, 4443, 4446, 4512, 4514, 4488, 4468, 4469, 4468, 4477, 4472, 4519, 4373, 4589, 4536, 4530, 4539, 4506, 4506, 4485, 4536, 4526, 4531, 4508, 4508, 4533, 4524, 4526, 4526, 4584, 4537, 4532, 4528, 4539, 4500, 4588, 4495, 4494, 4494, 4494, 4495, 4494, 4494, 4494, 4501};
        AFInAppEventParameterName = 2876202008483560423L;
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < 3) {
            arrayList.add(Integer.valueOf(strArr[i].length()));
            i++;
            valueOf = (registerClient + ISO781611.SMT_TAG) % 128;
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb6 = new StringBuilder();
        valueOf = (registerClient + LDSFile.EF_DG2_TAG) % 128;
        for (int i2 = 0; i2 < iIntValue; i2++) {
            Integer numValueOf = null;
            for (int i3 = 0; i3 < 3; i3++) {
                int i5 = valueOf + 103;
                registerClient = i5 % 128;
                if (i5 % 2 == 0) {
                    strArr[i3].charAt(i2);
                    throw null;
                }
                int iCharAt = strArr[i3].charAt(i2);
                if (numValueOf == null) {
                    valueOf = (registerClient + 65) % 128;
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb6.append(Integer.toHexString(numValueOf.intValue()));
        }
        return sb6;
    }

    private static void a(boolean z, int[] iArr, String str, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        int i = $11;
        $10 = (i + 87) % 128;
        Object obj2 = str2;
        if (str2 != null) {
            int i2 = i + 121;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                str2.getBytes("ISO-8859-1");
                throw null;
            }
            byte[] bytes = str2.getBytes("ISO-8859-1");
            $10 = ($11 + 17) % 128;
            obj2 = bytes;
        }
        byte[] bArr = (byte[]) obj2;
        AFj1dSDK aFj1dSDK = new AFj1dSDK();
        int i3 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i21 = iArr[3];
        char[] cArr = AFInAppEventType;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i22 = 0; i22 < length; i22++) {
                cArr2[i22] = (char) (((long) cArr[i22]) ^ (-6858333183171620386L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            aFj1dSDK.valueOf = 0;
            char c2 = 0;
            while (true) {
                int i32 = aFj1dSDK.valueOf;
                if (i32 >= i5) {
                    break;
                }
                if (bArr[i32] == 1) {
                    cArr4[i32] = (char) (((cArr3[i32] * 2) + 1) - c2);
                    $10 = ($11 + 79) % 128;
                } else {
                    cArr4[i32] = (char) ((cArr3[i32] * 2) - c2);
                    $11 = ($10 + 29) % 128;
                }
                c2 = cArr4[i32];
                aFj1dSDK.valueOf = i32 + 1;
            }
            cArr3 = cArr4;
        }
        if (i21 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i33 = i5 - i21;
            System.arraycopy(cArr5, 0, cArr3, i33, i21);
            System.arraycopy(cArr5, i21, cArr3, 0, i33);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            aFj1dSDK.valueOf = 0;
            while (true) {
                int i43 = aFj1dSDK.valueOf;
                if (i43 >= i5) {
                    break;
                }
                cArr6[i43] = cArr3[(i5 - i43) - 1];
                aFj1dSDK.valueOf = i43 + 1;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            aFj1dSDK.valueOf = 0;
            $10 = ($11 + 3) % 128;
            while (true) {
                int i59 = aFj1dSDK.valueOf;
                if (i59 >= i5) {
                    break;
                }
                cArr3[i59] = (char) (cArr3[i59] - iArr[2]);
                aFj1dSDK.valueOf = i59 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r11, int r12, java.lang.Object[] r13) {
        /*
            int r0 = com.appsflyer.internal.AFd1mSDK.$11
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r1
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L13
            r0 = 12
            int r0 = r0 / r2
            if (r11 == 0) goto L1f
            goto L15
        L13:
            if (r11 == 0) goto L1f
        L15:
            int r1 = r1 + 103
            int r1 = r1 % 128
            com.appsflyer.internal.AFd1mSDK.$11 = r1
            char[] r11 = r11.toCharArray()
        L1f:
            char[] r11 = (char[]) r11
            com.appsflyer.internal.AFk1xSDK r0 = new com.appsflyer.internal.AFk1xSDK
            r0.<init>()
            r0.AFInAppEventType = r12
            int r12 = r11.length
            long[] r1 = new long[r12]
            r0.values = r2
        L2d:
            int r3 = r0.values
            int r4 = r11.length
            if (r3 >= r4) goto L59
            int r4 = com.appsflyer.internal.AFd1mSDK.$11
            int r5 = r4 + 23
            int r5 = r5 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r5
            char r5 = r11[r3]
            long r5 = (long) r5
            long r7 = (long) r3
            int r9 = r0.AFInAppEventType
            long r9 = (long) r9
            long r7 = r7 * r9
            long r5 = r5 ^ r7
            long r7 = com.appsflyer.internal.AFd1mSDK.AFInAppEventParameterName
            r9 = -6362143322652431876(0xa7b5205b2b2da9fc, double:-2.094435621236843E-117)
            long r7 = r7 ^ r9
            long r5 = r5 ^ r7
            r1[r3] = r5
            int r3 = r3 + 1
            r0.values = r3
            int r4 = r4 + 117
            int r4 = r4 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r4
            goto L2d
        L59:
            char[] r12 = new char[r12]
            r0.values = r2
        L5d:
            int r3 = r0.values
            int r4 = r11.length
            if (r3 >= r4) goto L7b
            int r4 = com.appsflyer.internal.AFd1mSDK.$11
            int r5 = r4 + 103
            int r5 = r5 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r5
            r5 = r1[r3]
            int r5 = (int) r5
            char r5 = (char) r5
            r12[r3] = r5
            int r3 = r3 + 1
            r0.values = r3
            int r4 = r4 + 3
            int r4 = r4 % 128
            com.appsflyer.internal.AFd1mSDK.$10 = r4
            goto L5d
        L7b:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r12)
            r13[r2] = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.b(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String valueOf() throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.valueOf():java.lang.String");
    }
}
