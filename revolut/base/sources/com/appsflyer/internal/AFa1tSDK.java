package com.appsflyer.internal;

import java.util.Map;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes.dex */
public class AFa1tSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    private static final Map<String, Object> afErrorLogForExcManagerOnly;
    private static byte[] afLogForce;
    public static final Map<Integer, Object> afVerboseLog;
    private static long getCurrency;
    private static byte[] getLevel;
    private static int getPurchaseToken;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:14:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, short r8) {
        /*
            int r0 = com.appsflyer.internal.AFa1tSDK.$10
            r1 = r0 ^ 73
            r2 = r0 & 73
            int r2 = r2 << 1
            int r1 = r1 + r2
            int r1 = r1 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r1
            int r7 = -r7
            r1 = r7 | 119(0x77, float:1.67E-43)
            int r1 = r1 << 1
            r7 = r7 ^ 119(0x77, float:1.67E-43)
            int r1 = r1 - r7
            int r7 = -r8
            r8 = r7 & 983(0x3d7, float:1.377E-42)
            r7 = r7 | 983(0x3d7, float:1.377E-42)
            int r8 = r8 + r7
            byte[] r7 = com.appsflyer.internal.AFa1tSDK.$$a
            int r6 = -r6
            int r6 = ~r6
            int r6 = 35 - r6
            byte[] r2 = new byte[r6]
            r3 = 0
            if (r7 != 0) goto L42
            r4 = r0 | 1
            int r4 = r4 << 1
            r0 = r0 ^ 1
            int r4 = r4 - r0
            int r0 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.$11 = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L38
            r4 = 81
            int r4 = r4 / r3
        L38:
            int r0 = r0 + 77
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r0
            r4 = r1
            r0 = r3
            r1 = r8
            goto L5a
        L42:
            r0 = r3
        L43:
            byte r4 = (byte) r1
            r2[r0] = r4
            int r0 = r0 + 1
            if (r0 != r6) goto L50
            java.lang.String r6 = new java.lang.String
            r6.<init>(r2, r3)
            return r6
        L50:
            r4 = r7[r8]
            int r5 = com.appsflyer.internal.AFa1tSDK.$11
            int r5 = r5 + 45
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.$10 = r5
        L5a:
            r5 = r8 ^ 27
            r8 = r8 & 27
            int r8 = r8 << 1
            int r5 = r5 + r8
            r8 = r5 & (-26)
            r5 = r5 | (-26)
            int r8 = r8 + r5
            r5 = r1 & r4
            r1 = r1 | r4
            int r1 = r1 + r5
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.$$c(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:857|3|4|(2:6|7)(1:9)|10|(3:838|11|12)|(5:842|13|14|825|15)|(1:17)(34:855|22|23|787|24|25|(5:823|27|28|812|29)(2:32|31)|(8:949|34|35|970|36|37|968|38)(2:42|41)|(6:44|920|45|46|922|47)(2:50|49)|51|(1:(2:55|53)(3:56|882|57))(1:53)|(6:60|61|874|62|868|63)|64|(2:66|(1:(4:69|70|858|71)(1:78))(3:79|872|80))(0)|83|84|840|85|86|836|87|88|(1:90)(1:92)|91|(1:97)(1:98)|830|99|(1:101)(1:102)|103|(1:105)(1:106)|107|111|(3:115|(7:117|118|866|119|(16:127|972|128|129|(7:(11:947|132|133|942|134|135|940|136|137|936|138)(1:159)|955|160|816|161|162|993)(1:168)|(14:901|170|887|171|172|884|173|174|862|175|176|(11:(1:179)(2:(1:181)(1:(2:184|(0)(1:187))(1:188))|182)|189|190|(2:(7:193|782|194|(1:196)(1:198)|197|199|1010)(2:202|1009)|203)|1008|204|(4:206|880|207|208)(15:216|(6:218|966|219|220|1007|245)(1:(4:227|804|228|229)(18:235|818|236|985|237|238|979|239|240|964|241|242|961|243|244|210|1006|245))|200|201|155|156|157|728|(2:730|(2:1001|732)(1:733))|998|734|735|828|736|737)|209|210|1006|245)|1005|282)(1:294)|283|295|956|296|945|297|928|298|299|(22:300|301|302|918|303|899|304|893|305|(10:792|307|308|796|309|310|311|312|786|313)(18:324|864|325|326|876|327|328|329|330|331|332|850|333|844|334|335|832|336)|337|814|338|(19:886|340|(1:342)(1:343)|(1:345)(1:346)|347|944|938|348|349|932|350|(2:934|352)|363|930|364|365|(1:(19:926|367|368|914|369|370|909|371|372|907|373|374|(4:376|891|377|378)|905|498|895|499|995|500)(2:1004|398))|(9:575|827|576|977|577|578|579|(1:581)|582)(4:588|589|953|590)|(11:597|(1:599)(1:600)|601|810|602|807|603|604|794|605|606)(3:1002|622|1000))(12:513|798|514|515|783|516|517|518|519|(10:780|520|521|778|522|523|987|524|(5:526|911|527|528|(4:530|903|531|532)(0))(0)|983)|(0)(0)|(0)(0))|728|(0)|998|734|735|828|736|737))(1:122)|743|999)(4:125|(0)(0)|743|999)|744)|1011)|18|25|(0)(0)|(0)(0)|(0)(0)|51|(0)(0)|(0)|64|(0)(0)|83|84|840|85|86|836|87|88|(0)(0)|91|(0)(8:95|97|830|99|(0)(0)|103|(0)(0)|107)|111|(4:113|115|(0)(0)|744)|991|745|(3:(0)|(1:801)|(1:829))) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:857|3|4|(2:6|7)(1:9)|10|838|11|12|(5:842|13|14|825|15)|(1:17)(34:855|22|23|787|24|25|(5:823|27|28|812|29)(2:32|31)|(8:949|34|35|970|36|37|968|38)(2:42|41)|(6:44|920|45|46|922|47)(2:50|49)|51|(1:(2:55|53)(3:56|882|57))(1:53)|(6:60|61|874|62|868|63)|64|(2:66|(1:(4:69|70|858|71)(1:78))(3:79|872|80))(0)|83|84|840|85|86|836|87|88|(1:90)(1:92)|91|(1:97)(1:98)|830|99|(1:101)(1:102)|103|(1:105)(1:106)|107|111|(3:115|(7:117|118|866|119|(16:127|972|128|129|(7:(11:947|132|133|942|134|135|940|136|137|936|138)(1:159)|955|160|816|161|162|993)(1:168)|(14:901|170|887|171|172|884|173|174|862|175|176|(11:(1:179)(2:(1:181)(1:(2:184|(0)(1:187))(1:188))|182)|189|190|(2:(7:193|782|194|(1:196)(1:198)|197|199|1010)(2:202|1009)|203)|1008|204|(4:206|880|207|208)(15:216|(6:218|966|219|220|1007|245)(1:(4:227|804|228|229)(18:235|818|236|985|237|238|979|239|240|964|241|242|961|243|244|210|1006|245))|200|201|155|156|157|728|(2:730|(2:1001|732)(1:733))|998|734|735|828|736|737)|209|210|1006|245)|1005|282)(1:294)|283|295|956|296|945|297|928|298|299|(22:300|301|302|918|303|899|304|893|305|(10:792|307|308|796|309|310|311|312|786|313)(18:324|864|325|326|876|327|328|329|330|331|332|850|333|844|334|335|832|336)|337|814|338|(19:886|340|(1:342)(1:343)|(1:345)(1:346)|347|944|938|348|349|932|350|(2:934|352)|363|930|364|365|(1:(19:926|367|368|914|369|370|909|371|372|907|373|374|(4:376|891|377|378)|905|498|895|499|995|500)(2:1004|398))|(9:575|827|576|977|577|578|579|(1:581)|582)(4:588|589|953|590)|(11:597|(1:599)(1:600)|601|810|602|807|603|604|794|605|606)(3:1002|622|1000))(12:513|798|514|515|783|516|517|518|519|(10:780|520|521|778|522|523|987|524|(5:526|911|527|528|(4:530|903|531|532)(0))(0)|983)|(0)(0)|(0)(0))|728|(0)|998|734|735|828|736|737))(1:122)|743|999)(4:125|(0)(0)|743|999)|744)|1011)|18|25|(0)(0)|(0)(0)|(0)(0)|51|(0)(0)|(0)|64|(0)(0)|83|84|840|85|86|836|87|88|(0)(0)|91|(0)(8:95|97|830|99|(0)(0)|103|(0)(0)|107)|111|(4:113|115|(0)(0)|744)|991|745|(3:(0)|(1:801)|(1:829))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0342, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0345, code lost:
    
        r31 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03d1, code lost:
    
        if (((java.lang.Boolean) r5.getMethod($$c(r8, r9, (short) org.bouncycastle.asn1.BERTags.FLAGS), null).invoke(r0, null)).booleanValue() != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0bcf, code lost:
    
        r0 = com.appsflyer.internal.AFa1tSDK.$$a;
        r2 = java.lang.Class.forName($$c(r0[29], r0[r28], r14));
        r3 = r0[283(0x11b, float:3.97E-43)];
        r5 = r0[629(0x275, float:8.81E-43)];
        r3 = $$c(r3, r5, (short) (r5 | net.sf.scuba.smartcards.ISOFileInfo.FMD_BYTE));
        r2 = r2.getMethod(r3, null).invoke(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0bf7, code lost:
    
        r3 = 105(0x69, float:1.47E-43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0bf9, code lost:
    
        r3 = r0[105(0x69, float:1.47E-43)];
        r5 = r0[r28];
        r3 = java.lang.Class.forName($$c(r3, r5, (short) ((r5 ^ 96) | (r5 & 96))));
        r5 = (byte) (-r0[476(0x1dc, float:6.67E-43)]);
        r9 = r0[111(0x6f, float:1.56E-43)];
        r3 = r3.getMethod($$c(r5, r9, (short) ((r9 ^ 665) | (r9 & 665))), null);
        r3.invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0c26, code lost:
    
        r2 = com.appsflyer.internal.AFa1tSDK.$10;
        r3 = ((r2 & 1) + (r2 | 1)) % 128;
        com.appsflyer.internal.AFa1tSDK.$11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0c35, code lost:
    
        r2 = java.lang.Class.forName($$c(r0[29], r0[r28], r14));
        r3 = $$c(r0[283(0x11b, float:3.97E-43)], r0[r19], (short) 338);
        r2.getMethod(r3, null).invoke(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0c58, code lost:
    
        r2 = java.lang.Class.forName($$c(r0[r23], r0[r42], (short) 743));
        r3 = $$c(r0[459(0x1cb, float:6.43E-43)], r0[154(0x9a, float:2.16E-43)], (short) (com.appsflyer.internal.AFa1tSDK.$$b | 368));
        r2 = r2.getDeclaredMethod(r3, java.lang.String.class, java.lang.String.class, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0c82, code lost:
    
        r3 = java.lang.Class.forName($$c(r0[r26], r0[r28], r7));
        r5 = r0[r22];
        r8 = r0[629(0x275, float:8.81E-43)];
        r3 = r3.getMethod($$c(r5, r8, (short) (r8 | 270)), null).invoke(r12, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0ca6, code lost:
    
        com.appsflyer.internal.AFa1tSDK.$10 = (com.appsflyer.internal.AFa1tSDK.$11 + 39) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0cae, code lost:
    
        r5 = java.lang.Class.forName($$c(r0[r26], r0[r28], r7));
        r8 = r0[r22];
        r9 = r0[629(0x275, float:8.81E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0cd5, code lost:
    
        r3 = new java.lang.Object[]{r3, r5.getMethod($$c(r8, r9, (short) ((r9 ^ 270) | (r9 & 270))), null).invoke(r11, null), r6};
        r2 = r2.invoke(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0cdd, code lost:
    
        r9 = (short) 393;
        r3 = (java.lang.Boolean) java.lang.Class.forName($$c(r0[r26], r0[r28], r7)).getMethod($$c(r0[230(0xe6, float:3.22E-43)], r0[r42], r9), null).invoke(r12, null);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0d06, code lost:
    
        r3 = (java.lang.Boolean) java.lang.Class.forName($$c(r0[r26], r0[r28], r7)).getMethod($$c(r0[230(0xe6, float:3.22E-43)], r0[r42], r9), null).invoke(r11, null);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0d2e, code lost:
    
        if (com.appsflyer.internal.AFa1tSDK.AFLogger$LogLevel != null) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0d44, code lost:
    
        r3 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0d4a, code lost:
    
        com.appsflyer.internal.AFa1tSDK.AFLogger$LogLevel = java.lang.Class.class.getMethod($$c(r0[r24], r0[629(0x275, float:8.81E-43)], (short) 416), null).invoke(r3, null);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0d4d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0d4e, code lost:
    
        r62 = r6;
        r2 = r63;
        r29 = 3;
        r63 = r7;
        r3 = r3;
        r39 = r39;
        r53 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0d5a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0d5c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0d5f, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0d63, code lost:
    
        if (r2 != null) goto L425;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0d65, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0d66, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0d67, code lost:
    
        r3 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0d69, code lost:
    
        r5 = r2;
        r62 = r6;
        r2 = r63;
        r63 = r7;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0d74, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0d75, code lost:
    
        r3 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0d78, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0d79, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0d7f, code lost:
    
        if (r2 != null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0d81, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0d82, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0d83, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0d84, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0d8a, code lost:
    
        if (r2 != null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0d8c, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0d8d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0d8e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0d8f, code lost:
    
        r3 = r64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0d91, code lost:
    
        r2 = r63;
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0d95, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0d98, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0d9c, code lost:
    
        if (r2 != null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0d9e, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0d9f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0da0, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0da1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0da2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0da3, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0da9, code lost:
    
        if (r2 != null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0dab, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0dac, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0dad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0dae, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0db4, code lost:
    
        if (r2 != null) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0db6, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0db7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0db8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0db9, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0dbf, code lost:
    
        if (r2 != null) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0dc1, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0dc2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0dc3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0dc4, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0dca, code lost:
    
        if (r2 != null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0dcc, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0dcd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0fbb, code lost:
    
        r0 = java.lang.Class.forName($$c((byte) r57[r61], (byte) r57[r28], r13));
        r6 = (byte) (-r57[r21]);
        r7 = (byte) r57[r18];
        r8 = r57[0];
        r6 = r0.getMethod($$c(r6, r7, (short) ((r8 & 1) + (r8 | 1))), null).invoke(r14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0fe7, code lost:
    
        java.lang.Class.forName($$c((byte) r57[r60], (byte) r57[r28], r12)).getMethod($$c((byte) r57[283(0x11b, float:3.97E-43)], (byte) r57[r19], (short) 338), null).invoke(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x100b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x100c, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x1010, code lost:
    
        if (r5 != null) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x1012, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x1013, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x1014, code lost:
    
        r0 = com.appsflyer.internal.AFa1tSDK.$$a;
        java.lang.Class.forName($$c(r0[r61], r0[r28], r13)).getMethod($$c(r0[283(0x11b, float:3.97E-43)], r0[r19], (short) 338), null).invoke(r14, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x103a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x103b, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x103f, code lost:
    
        if (r5 != null) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x1041, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x1042, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x1043, code lost:
    
        r5 = com.appsflyer.internal.AFa1tSDK.$$a;
        r7 = java.lang.Class.class.getMethod($$c(r5[r24], r5[629(0x275, float:8.81E-43)], (short) 416), null).invoke(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x105d, code lost:
    
        r11 = (short) 898;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x10c7, code lost:
    
        r0 = java.lang.Class.forName($$c(r5[14], r5[r42], (short) 830)).getDeclaredConstructor(java.lang.Class.forName($$c(r5[202(0xca, float:2.83E-43)], r5[r28], r11)), java.lang.Class.forName($$c(r5[r23], r5[r28], (short) 608))).newInstance(java.lang.Class.forName($$c(r5[202(0xca, float:2.83E-43)], r5[r28], r11)).getMethod($$c((byte) (-r5[476(0x1dc, float:6.67E-43)]), r5[14], r5[440(0x1b8, float:6.17E-43)]), byte[].class).invoke(null, r6), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x10cf, code lost:
    
        r6 = java.lang.Class.forName($$c(r5[111(0x6f, float:1.56E-43)], r5[r42], (short) 714));
        r8 = r5[869(0x365, float:1.218E-42)];
        r9 = r5[r61];
        r6 = r6.getDeclaredField($$c(r8, r9, (short) ((r9 ^ net.sf.scuba.smartcards.ISO7816.INS_GET_RESPONSE) | (r9 & net.sf.scuba.smartcards.ISO7816.INS_GET_RESPONSE))));
        r6.setAccessible(true);
        r8 = r6.get(r7);
        r9 = r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x1104, code lost:
    
        r11 = r9.getDeclaredField($$c(r5[29], r5[r60], (short) (-r5[319(0x13f, float:4.47E-43)])));
        r11.setAccessible(true);
        r5 = r9.getDeclaredField($$c(r5[154(0x9a, float:2.16E-43)], r5[r60], (short) 362));
        r5.setAccessible(true);
        r9 = r11.get(r8);
        r8 = r5.get(r8);
        r6 = r6.get(r0);
        r12 = new java.util.ArrayList((java.util.List) r9);
        r9 = r8.getClass().getComponentType();
        r13 = java.lang.reflect.Array.getLength(r8);
        r9 = java.lang.reflect.Array.newInstance(r9, r13);
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x1158, code lost:
    
        java.lang.reflect.Array.set(r9, r14, java.lang.reflect.Array.get(r8, r14));
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x1167, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x116a, code lost:
    
        r11.set(r6, r12);
        r5.set(r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x1172, code lost:
    
        if (com.appsflyer.internal.AFa1tSDK.AFLogger$LogLevel == null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x1174, code lost:
    
        com.appsflyer.internal.AFa1tSDK.$10 = (com.appsflyer.internal.AFa1tSDK.$11 + 63) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x117c, code lost:
    
        com.appsflyer.internal.AFa1tSDK.AFLogger$LogLevel = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x117e, code lost:
    
        r5 = r0;
        r3 = r3;
        r57 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x1386, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x138b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x138e, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = com.appsflyer.internal.AFa1tSDK.$$a;
        r5.append($$c(r6[283(0x11b, float:3.97E-43)], r6[119(0x77, float:1.67E-43)], (short) 636));
        r5.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x13a8, code lost:
    
        r29 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x13aa, code lost:
    
        r5.append($$c(r6[3], (byte) 78, (short) 743));
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x13e6, code lost:
    
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(r6[202(0xca, float:2.83E-43)], r6[r28], (short) com.youTransactor.uCube.rpc.Constants.TAG_BOOT_LOADER_VERSION)).getDeclaredConstructor(java.lang.String.class, r2).newInstance(r5.toString(), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x13e7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x13e8, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x13ec, code lost:
    
        if (r5 != null) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x13ee, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x13ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x13f0, code lost:
    
        r3 = r3;
        r39 = r39;
        r53 = r53;
        r57 = r57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x13f2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x13f3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x13f4, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x13fc, code lost:
    
        if (r5 != null) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x13fe, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x13ff, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x1400, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x1401, code lost:
    
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x1409, code lost:
    
        if (r5 != null) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x140b, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x140c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x1359 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0363 A[Catch: Exception -> 0x15a4, TRY_ENTER, TRY_LEAVE, TryCatch #44 {Exception -> 0x15a4, blocks: (B:3:0x0028, B:7:0x0050, B:60:0x01be, B:747:0x158a, B:749:0x1590, B:750:0x1591, B:752:0x1593, B:754:0x1599, B:755:0x159a, B:69:0x0234, B:83:0x0293, B:85:0x02dc, B:87:0x02e1, B:99:0x0329, B:103:0x0334, B:107:0x033f, B:117:0x0363, B:119:0x0367, B:744:0x156d, B:730:0x1517, B:732:0x151b, B:733:0x1525, B:734:0x152a, B:739:0x1563, B:741:0x1569, B:742:0x156a, B:125:0x0389, B:74:0x0283, B:76:0x0289, B:77:0x028a, B:80:0x0290, B:56:0x0177, B:757:0x159c, B:759:0x15a2, B:760:0x15a3, B:736:0x153a, B:737:0x1561, B:71:0x0250, B:63:0x0205, B:62:0x01d5, B:57:0x019c), top: B:857:0x0028, inners: #29, #45, #51, #54, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0389 A[Catch: Exception -> 0x15a4, TRY_ENTER, TRY_LEAVE, TryCatch #44 {Exception -> 0x15a4, blocks: (B:3:0x0028, B:7:0x0050, B:60:0x01be, B:747:0x158a, B:749:0x1590, B:750:0x1591, B:752:0x1593, B:754:0x1599, B:755:0x159a, B:69:0x0234, B:83:0x0293, B:85:0x02dc, B:87:0x02e1, B:99:0x0329, B:103:0x0334, B:107:0x033f, B:117:0x0363, B:119:0x0367, B:744:0x156d, B:730:0x1517, B:732:0x151b, B:733:0x1525, B:734:0x152a, B:739:0x1563, B:741:0x1569, B:742:0x156a, B:125:0x0389, B:74:0x0283, B:76:0x0289, B:77:0x028a, B:80:0x0290, B:56:0x0177, B:757:0x159c, B:759:0x15a2, B:760:0x15a3, B:736:0x153a, B:737:0x1561, B:71:0x0250, B:63:0x0205, B:62:0x01d5, B:57:0x019c), top: B:857:0x0028, inners: #29, #45, #51, #54, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e9 A[Catch: all -> 0x03ea, TryCatch #99 {all -> 0x03ea, blocks: (B:160:0x0402, B:164:0x0457, B:166:0x045d, B:167:0x045e, B:149:0x03e3, B:151:0x03e9, B:158:0x03fb, B:161:0x0432, B:162:0x0455), top: B:955:0x0402, inners: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03fb A[Catch: all -> 0x03ea, TryCatch #99 {all -> 0x03ea, blocks: (B:160:0x0402, B:164:0x0457, B:166:0x045d, B:167:0x045e, B:149:0x03e3, B:151:0x03e9, B:158:0x03fb, B:161:0x0432, B:162:0x0455), top: B:955:0x0402, inners: #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0bc2 A[Catch: all -> 0x0baa, TryCatch #67 {all -> 0x0baa, blocks: (B:380:0x0ba3, B:382:0x0ba9, B:385:0x0bb1, B:392:0x0bbc, B:394:0x0bc2, B:395:0x0bc3, B:377:0x0b51), top: B:891:0x0b51, inners: #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0bc3 A[Catch: all -> 0x0baa, TRY_LEAVE, TryCatch #67 {all -> 0x0baa, blocks: (B:380:0x0ba3, B:382:0x0ba9, B:385:0x0bb1, B:392:0x0bbc, B:394:0x0bc2, B:395:0x0bc3, B:377:0x0b51), top: B:891:0x0b51, inners: #64 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e A[PHI: r5
      0x016e: PHI (r5v286 java.lang.Object) = (r5v12 java.lang.Object), (r5v17 java.lang.Object) binds: [B:52:0x016c, B:55:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1158 A[Catch: all -> 0x1162, Exception -> 0x1167, LOOP:4: B:562:0x1156->B:563:0x1158, LOOP_END, TryCatch #28 {all -> 0x1162, blocks: (B:576:0x1189, B:579:0x11e0, B:581:0x11ea, B:597:0x124c, B:601:0x127c, B:606:0x1329, B:608:0x133f, B:610:0x1345, B:611:0x1346, B:613:0x1348, B:615:0x134e, B:616:0x134f, B:618:0x1351, B:620:0x1357, B:621:0x1358, B:622:0x1359, B:584:0x1202, B:586:0x1208, B:587:0x1209, B:588:0x120a, B:590:0x1235, B:593:0x1242, B:594:0x1248, B:561:0x1104, B:563:0x1158, B:568:0x116a, B:569:0x1170, B:572:0x117c, B:627:0x138e, B:605:0x1308, B:603:0x12d1, B:602:0x12a1, B:577:0x11c6), top: B:827:0x1189, inners: #10, #17, #19, #112 }] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x1174  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x120a A[Catch: all -> 0x1162, TRY_LEAVE, TryCatch #28 {all -> 0x1162, blocks: (B:576:0x1189, B:579:0x11e0, B:581:0x11ea, B:597:0x124c, B:601:0x127c, B:606:0x1329, B:608:0x133f, B:610:0x1345, B:611:0x1346, B:613:0x1348, B:615:0x134e, B:616:0x134f, B:618:0x1351, B:620:0x1357, B:621:0x1358, B:622:0x1359, B:584:0x1202, B:586:0x1208, B:587:0x1209, B:588:0x120a, B:590:0x1235, B:593:0x1242, B:594:0x1248, B:561:0x1104, B:563:0x1158, B:568:0x116a, B:569:0x1170, B:572:0x117c, B:627:0x138e, B:605:0x1308, B:603:0x12d1, B:602:0x12a1, B:577:0x11c6), top: B:827:0x1189, inners: #10, #17, #19, #112 }] */
    /* JADX WARN: Removed duplicated region for block: B:597:0x124c A[Catch: all -> 0x1162, TRY_ENTER, TRY_LEAVE, TryCatch #28 {all -> 0x1162, blocks: (B:576:0x1189, B:579:0x11e0, B:581:0x11ea, B:597:0x124c, B:601:0x127c, B:606:0x1329, B:608:0x133f, B:610:0x1345, B:611:0x1346, B:613:0x1348, B:615:0x134e, B:616:0x134f, B:618:0x1351, B:620:0x1357, B:621:0x1358, B:622:0x1359, B:584:0x1202, B:586:0x1208, B:587:0x1209, B:588:0x120a, B:590:0x1235, B:593:0x1242, B:594:0x1248, B:561:0x1104, B:563:0x1158, B:568:0x116a, B:569:0x1170, B:572:0x117c, B:627:0x138e, B:605:0x1308, B:603:0x12d1, B:602:0x12a1, B:577:0x11c6), top: B:827:0x1189, inners: #10, #17, #19, #112 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be A[Catch: Exception -> 0x15a4, TRY_ENTER, TRY_LEAVE, TryCatch #44 {Exception -> 0x15a4, blocks: (B:3:0x0028, B:7:0x0050, B:60:0x01be, B:747:0x158a, B:749:0x1590, B:750:0x1591, B:752:0x1593, B:754:0x1599, B:755:0x159a, B:69:0x0234, B:83:0x0293, B:85:0x02dc, B:87:0x02e1, B:99:0x0329, B:103:0x0334, B:107:0x033f, B:117:0x0363, B:119:0x0367, B:744:0x156d, B:730:0x1517, B:732:0x151b, B:733:0x1525, B:734:0x152a, B:739:0x1563, B:741:0x1569, B:742:0x156a, B:125:0x0389, B:74:0x0283, B:76:0x0289, B:77:0x028a, B:80:0x0290, B:56:0x0177, B:757:0x159c, B:759:0x15a2, B:760:0x15a3, B:736:0x153a, B:737:0x1561, B:71:0x0250, B:63:0x0205, B:62:0x01d5, B:57:0x019c), top: B:857:0x0028, inners: #29, #45, #51, #54, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x142e A[Catch: all -> 0x13ef, TryCatch #101 {all -> 0x13ef, blocks: (B:629:0x13aa, B:634:0x13e8, B:636:0x13ee, B:639:0x13f2, B:641:0x13f4, B:643:0x13fe, B:644:0x13ff, B:646:0x1401, B:648:0x140b, B:649:0x140c, B:651:0x140e, B:653:0x1418, B:654:0x1419, B:661:0x1428, B:663:0x142e, B:664:0x142f, B:666:0x1431, B:668:0x143f, B:669:0x1440, B:671:0x1442, B:673:0x1450, B:674:0x1451, B:676:0x1453, B:678:0x1461, B:679:0x1462, B:688:0x147f, B:690:0x1485, B:691:0x1486, B:696:0x149c, B:698:0x14a2, B:699:0x14a3, B:707:0x14c3, B:709:0x14c9, B:710:0x14ca, B:712:0x14cc, B:714:0x14da, B:715:0x14db, B:717:0x14dd, B:719:0x14eb, B:720:0x14ec, B:722:0x14ee, B:724:0x14fc, B:725:0x14fd, B:516:0x0f00, B:514:0x0ecc, B:338:0x0a0e, B:298:0x083c, B:297:0x080c, B:631:0x13bf, B:632:0x13e6, B:296:0x07d8, B:557:0x1098, B:555:0x1043, B:540:0x0fbb), top: B:958:0x13aa, inners: #3, #12, #21, #85, #94, #97, #100, #102, #110, #115 }] */
    /* JADX WARN: Removed duplicated region for block: B:664:0x142f A[Catch: all -> 0x13ef, TryCatch #101 {all -> 0x13ef, blocks: (B:629:0x13aa, B:634:0x13e8, B:636:0x13ee, B:639:0x13f2, B:641:0x13f4, B:643:0x13fe, B:644:0x13ff, B:646:0x1401, B:648:0x140b, B:649:0x140c, B:651:0x140e, B:653:0x1418, B:654:0x1419, B:661:0x1428, B:663:0x142e, B:664:0x142f, B:666:0x1431, B:668:0x143f, B:669:0x1440, B:671:0x1442, B:673:0x1450, B:674:0x1451, B:676:0x1453, B:678:0x1461, B:679:0x1462, B:688:0x147f, B:690:0x1485, B:691:0x1486, B:696:0x149c, B:698:0x14a2, B:699:0x14a3, B:707:0x14c3, B:709:0x14c9, B:710:0x14ca, B:712:0x14cc, B:714:0x14da, B:715:0x14db, B:717:0x14dd, B:719:0x14eb, B:720:0x14ec, B:722:0x14ee, B:724:0x14fc, B:725:0x14fd, B:516:0x0f00, B:514:0x0ecc, B:338:0x0a0e, B:298:0x083c, B:297:0x080c, B:631:0x13bf, B:632:0x13e6, B:296:0x07d8, B:557:0x1098, B:555:0x1043, B:540:0x0fbb), top: B:958:0x13aa, inners: #3, #12, #21, #85, #94, #97, #100, #102, #110, #115 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x1517 A[Catch: Exception -> 0x15a4, TRY_ENTER, TryCatch #44 {Exception -> 0x15a4, blocks: (B:3:0x0028, B:7:0x0050, B:60:0x01be, B:747:0x158a, B:749:0x1590, B:750:0x1591, B:752:0x1593, B:754:0x1599, B:755:0x159a, B:69:0x0234, B:83:0x0293, B:85:0x02dc, B:87:0x02e1, B:99:0x0329, B:103:0x0334, B:107:0x033f, B:117:0x0363, B:119:0x0367, B:744:0x156d, B:730:0x1517, B:732:0x151b, B:733:0x1525, B:734:0x152a, B:739:0x1563, B:741:0x1569, B:742:0x156a, B:125:0x0389, B:74:0x0283, B:76:0x0289, B:77:0x028a, B:80:0x0290, B:56:0x0177, B:757:0x159c, B:759:0x15a2, B:760:0x15a3, B:736:0x153a, B:737:0x1561, B:71:0x0250, B:63:0x0205, B:62:0x01d5, B:57:0x019c), top: B:857:0x0028, inners: #29, #45, #51, #54, #58 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:949:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0327  */
    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v202, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r12v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69, types: [int] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v39 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v100 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v115 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v32, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v64, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r53v10 */
    /* JADX WARN: Type inference failed for: r53v11 */
    /* JADX WARN: Type inference failed for: r53v12 */
    /* JADX WARN: Type inference failed for: r53v15 */
    /* JADX WARN: Type inference failed for: r53v16 */
    /* JADX WARN: Type inference failed for: r53v2 */
    /* JADX WARN: Type inference failed for: r53v21 */
    /* JADX WARN: Type inference failed for: r53v22 */
    /* JADX WARN: Type inference failed for: r53v23 */
    /* JADX WARN: Type inference failed for: r53v24 */
    /* JADX WARN: Type inference failed for: r53v25 */
    /* JADX WARN: Type inference failed for: r53v26 */
    /* JADX WARN: Type inference failed for: r53v27 */
    /* JADX WARN: Type inference failed for: r53v28 */
    /* JADX WARN: Type inference failed for: r53v29 */
    /* JADX WARN: Type inference failed for: r53v3 */
    /* JADX WARN: Type inference failed for: r53v30 */
    /* JADX WARN: Type inference failed for: r53v31 */
    /* JADX WARN: Type inference failed for: r53v32 */
    /* JADX WARN: Type inference failed for: r53v4 */
    /* JADX WARN: Type inference failed for: r53v8 */
    /* JADX WARN: Type inference failed for: r53v9 */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v11 */
    /* JADX WARN: Type inference failed for: r57v12 */
    /* JADX WARN: Type inference failed for: r57v13 */
    /* JADX WARN: Type inference failed for: r57v15 */
    /* JADX WARN: Type inference failed for: r57v16 */
    /* JADX WARN: Type inference failed for: r57v17 */
    /* JADX WARN: Type inference failed for: r57v18 */
    /* JADX WARN: Type inference failed for: r57v19 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v20 */
    /* JADX WARN: Type inference failed for: r57v21 */
    /* JADX WARN: Type inference failed for: r57v22 */
    /* JADX WARN: Type inference failed for: r57v23 */
    /* JADX WARN: Type inference failed for: r57v24 */
    /* JADX WARN: Type inference failed for: r57v25 */
    /* JADX WARN: Type inference failed for: r57v26 */
    /* JADX WARN: Type inference failed for: r57v27 */
    /* JADX WARN: Type inference failed for: r57v28 */
    /* JADX WARN: Type inference failed for: r57v29 */
    /* JADX WARN: Type inference failed for: r57v3 */
    /* JADX WARN: Type inference failed for: r57v30 */
    /* JADX WARN: Type inference failed for: r57v31 */
    /* JADX WARN: Type inference failed for: r57v32 */
    /* JADX WARN: Type inference failed for: r57v33 */
    /* JADX WARN: Type inference failed for: r57v34 */
    /* JADX WARN: Type inference failed for: r57v35 */
    /* JADX WARN: Type inference failed for: r57v36 */
    /* JADX WARN: Type inference failed for: r57v37 */
    /* JADX WARN: Type inference failed for: r57v38 */
    /* JADX WARN: Type inference failed for: r57v4 */
    /* JADX WARN: Type inference failed for: r57v5 */
    /* JADX WARN: Type inference failed for: r57v7 */
    /* JADX WARN: Type inference failed for: r57v8 */
    /* JADX WARN: Type inference failed for: r57v9 */
    /* JADX WARN: Type inference failed for: r60v6 */
    /* JADX WARN: Type inference failed for: r61v0 */
    /* JADX WARN: Type inference failed for: r61v1 */
    /* JADX WARN: Type inference failed for: r61v7 */
    /* JADX WARN: Type inference failed for: r64v0 */
    /* JADX WARN: Type inference failed for: r64v1 */
    /* JADX WARN: Type inference failed for: r64v2 */
    /* JADX WARN: Type inference failed for: r64v3 */
    /* JADX WARN: Type inference failed for: r64v4 */
    /* JADX WARN: Type inference failed for: r64v6 */
    /* JADX WARN: Type inference failed for: r8v166 */
    /* JADX WARN: Type inference failed for: r8v176, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v225 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v93, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v94 */
    static {
        /*
            Method dump skipped, instruction units count: 5564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.<clinit>():void");
    }

    private AFa1tSDK() {
    }

    public static int AFInAppEventParameterName(int i) throws Throwable {
        int i2 = $11;
        int i3 = ((i2 | 123) << 1) - (i2 ^ 123);
        int i5 = i3 % 128;
        $10 = i5;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj2 = AFPurchaseDetails;
        $11 = (i5 + LDSFile.EF_DG13_TAG) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = $$a;
            byte b4 = bArr[69];
            byte b5 = bArr[11];
            int iIntValue = ((Integer) Class.forName($$c(b4, b5, (short) ((b5 ^ 137) | (b5 & 137))), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(bArr[154], (byte) (-bArr[109]), (short) 632), Integer.TYPE).invoke(obj2, objArr)).intValue();
            int i6 = $10;
            $11 = ((i6 & ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG) + (i6 | ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG)) % 128;
            return iIntValue;
        } catch (Throwable th10) {
            Throwable cause = th10.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th10;
        }
    }

    public static int AFInAppEventType(Object obj2) throws Throwable {
        int i = $11;
        int i2 = (i & 85) + (i | 85);
        int i3 = i2 % 128;
        $10 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object obj3 = AFPurchaseDetails;
        $11 = (i3 + 77) % 128;
        try {
            byte[] bArr = $$a;
            byte b4 = bArr[69];
            byte b5 = bArr[11];
            int iIntValue = ((Integer) Class.forName($$c(b4, b5, (short) (b5 | 137)), true, (ClassLoader) AFLogger$LogLevel).getMethod($$c(bArr[154], (byte) (-bArr[109]), (short) 632), Object.class).invoke(obj3, obj2)).intValue();
            int i5 = $10;
            int i6 = ((i5 | 85) << 1) - (i5 ^ 85);
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i21 = 4 / 0;
            }
            return iIntValue;
        } catch (Throwable th10) {
            Throwable cause = th10.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th10;
        }
    }

    public static void init$0() {
        int i = $10;
        $11 = ((i & 77) + (i | 77)) % 128;
        byte[] bArr = new byte[1001];
        System.arraycopy("WÕj#÷\u0015ëÍ;\u0006¿\u00143ñ\u0000ÿ\róÿå%\u0002\u0005ÿß!þóü\f÷\u0015ëÍ>õ\rùÇ%&ú\u0001ñ\b\u0012ý\u0000ó\t\u0006Í/\u0000üýúþ\u0013õ\u0006ÿþ\u000fÙ\"õ\u0005ý\u0003ü\rÛ\u0018\u000fíò!í\u0013ñè\u0014\u0012ø÷\u0015ëÍ@û\u0006¿\u00147ûñÝ3ñ\u0000ÿ\r\rö\u000eýúûÊA\u0004»\u00143ô\u0003øÀ2ï\r\u0001ö\u0006ÿ÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ð%\u0002\u0005ÿß!þóü\fý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u001b%ß\u0018\b\u0002\u0003\u0007Ë!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\róü\u0003â/÷\u0000\r\u0001\u0003ûô\u000bý\u0011ëè\u0018\u000fíò!í\u0013ñþ\u000fÒ#\u0003ù\u000eÑ%\tû÷\u000bñþ\u000fÏ\u001e\u0002\u0005ýß%\tóü\u0003ý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0016!\u0013Î#\u0003ù\fõ\u0001ú\u0004þ\u0002\u0005ýý\u000b\nó\u0002ÃE\u0006ú\u0001ñ\bÁ\u0014\u001f\u0012òß!\u0013Ë)õ\u0012\u0000Ù#ò\u0003\u0001\rþ\u000fÏ,õ\u0001Þ\u001e\u0002\u0005ýß%\t\u0006õõë\u0007é\bF\u0001±Fû\u000b\u0000öÿ\u0002\b\b\u00adLù\u0001\u000eµë\u0006ê\bë\u0004ì\bë\bè\b\u0005\u0003%Ó/\u0000Õ1ï\t\u0006Ü\u0011\u0011ï\fø\u000fñ\rÜ\u0013\fø÷\u0015ëÍ>õ\rùÇ\u0015)õ\u0012\u0000Ù#ò\u0003\u0001\r\rö\u000eýúûÊ3\u000f\u0000¾\u0013/\u0000×%\u0003óÿ\u000b\u0007ò\u000fÞ\u0013ü\u0003ë\u001fþ\r4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ3Ë÷\u0015ëÍ;\u0006¿\u0016\u001d\u0013íè%\u0002\u0005ÿß!þóü\f\u0003ò\u0003à!\u0013\rö\u000eýúûÊHóü\u0012·\u001d\u001a\u0014Ì1ï\t\u0006÷\u0015ëÍ;\u0006¿\u00147ûñÜ1\u0000ï\u0018Ö&ÿü\u0005ÿß!þóü\fë\u000b\tð\u000e\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐCßñ\u0007ÙSøþ\u0007þ\u000fÏ)õ\u0012\u0000Ù#ò\u0003\u0001\r5ý\u0013íÎ5ý\u0013íÎ\u0001\u0007ù\u000fñ\u0005\u0005\u001a\u0014ú\u0001û\u0003óò\u001bï\u000f\u0000õ\rþ\u000fÒþñ\u0007\u0014ê\u0005\u0006ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007×\u0011\u0013ôÝ'ù\bø\t\u0006ÿ\t\u0003\u0004ò4\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ2Ì÷\u0015ëÍ;\u0006¿Fù\u0003ô\u0005\tþ\u000fÜ\"ý\u0001õ\r\u0002\u0005þ\u000fÍ!\u0011üý\tÿñë\u0011\u0013ô\rö\u000eýúûÊ3\u000f\u0000¾\u0013\"\u0011õ\ró\u000b\u0005Û\u0014\nóü\u0003÷\u0015ëÍ;\u0006¿\u0018#\u0003ùê&ÿü\u0005ÿß!þóü\fþ\ré\u001b÷\u000bñ÷\u0015ëÍ;\u0006¿\u001b\u0006ö3ë\u0002\u000b\u0004õ\u0006ÿñ\u0013ôä\u001d\n\u0001þ\u000fÕ%û\u000bõø\u000bÕ/\u0000üýúþ\u0013õ\u0006ÿ÷\u0015ëÍ;\u0006¿\u0018#\u0003ùë\u0003í\b\fþÁ3\u000f\u0000\u0003ó\u0006\rì\r¼;\u0005\u0006ñ\rüó\u000bÂ\u0013\u0005\u001bÐEÝñ\u0007Ù\u0000\u0012ý\u0000ó\t\u0006à\u0015\u0004øè\u001c\u0003\u0000ý\n÷\u0015ëÍ;\u0006¿\u0018#\u0003ùß!\u000eð\u000f÷\u0007\u0004û\u0003ûÓ7ûñÜ1\u0000ï\u0018\u0003ò\u0003ß)õ\u0012\u0000\fþÁ3\u000f\u0000\u0003ó\u0006\rì\rûï\u000f\fþÂ2\u000f\u0000\u0003ó\u0006\rì\r½:\u0005\u0006ñ\rüó\u000bÃ\u0012\u0005\u001bÐEÝñ\u0007Ù\u0000ó\u0013õ\rïç\u001dù\u0010ï\u0011\u0007Ë%\tóþ\u0011û\u0003÷ü\u000e÷\u0015ëÍ;\u0006¿\u001b%\u0002\u0005ÿß!þóü\f".getBytes("ISO-8859-1"), 0, bArr, 0, 1001);
        $$a = bArr;
        $$b = 142;
        int i2 = $10;
        $11 = (((i2 | 99) << 1) - (i2 ^ 99)) % 128;
    }

    public static Object valueOf(int i, int i2, char c2) throws Throwable {
        int i3 = $11;
        int i5 = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
        $10 = i5;
        Object obj2 = AFPurchaseDetails;
        $11 = (i5 + LDSFile.EF_SOD_TAG) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c2)};
            byte[] bArr = $$a;
            byte b4 = bArr[69];
            byte b5 = bArr[11];
            Class<?> cls = Class.forName($$c(b4, b5, (short) ((b5 ^ 137) | (b5 & 137))), true, (ClassLoader) AFLogger$LogLevel);
            String str$$c = $$c(bArr[230], bArr[42], (short) 456);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj2, objArr);
            int i6 = $11 + LDSFile.EF_SOD_TAG;
            $10 = i6 % 128;
            if (i6 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th10) {
            Throwable cause = th10.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th10;
        }
    }
}
