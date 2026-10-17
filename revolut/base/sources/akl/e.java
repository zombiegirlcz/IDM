package akl;

import com.revolut.sso.impl.domain.models.AuthAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.i implements Function2 {
    public String u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f6000w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f6001x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AuthAction f6002y;
    public final /* synthetic */ gkl.i z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AuthAction authAction, gkl.i iVar, Continuation continuation) {
        super(2, continuation);
        this.f6001x = hVar;
        this.f6002y = authAction;
        this.z = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f6001x, this.f6002y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x053c A[Catch: HttpException -> 0x0343, TryCatch #0 {HttpException -> 0x0343, blocks: (B:230:0x0468, B:269:0x0596, B:291:0x05cf, B:292:0x05f1, B:294:0x05f7, B:295:0x0605, B:290:0x05cb, B:189:0x0326, B:191:0x0332, B:195:0x033d, B:196:0x0342, B:199:0x0347, B:201:0x034b, B:202:0x0350, B:204:0x0358, B:207:0x0379, B:218:0x03f8, B:210:0x039e, B:213:0x03ab, B:214:0x03ba, B:216:0x03c5, B:217:0x03d4, B:219:0x03ff, B:221:0x0403, B:223:0x040c, B:224:0x041b, B:225:0x0437, B:227:0x043b, B:231:0x0471, B:233:0x0475, B:234:0x04ac, B:236:0x04b2, B:237:0x04c0, B:238:0x04d2, B:240:0x04d8, B:242:0x04e4, B:243:0x04e8, B:244:0x04fa, B:246:0x04fe, B:247:0x0502, B:249:0x0506, B:250:0x052f, B:251:0x0530, B:252:0x0535, B:253:0x0536, B:254:0x053b, B:255:0x053c, B:257:0x0546, B:259:0x0573, B:262:0x0579, B:264:0x057d, B:266:0x0586, B:271:0x059b, B:273:0x059f, B:276:0x05a4, B:277:0x05a9, B:279:0x05ac, B:282:0x05b1, B:285:0x05b6, B:286:0x05bb, B:287:0x05bc, B:428:0x079f, B:429:0x07a4), top: B:446:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05f7 A[Catch: HttpException -> 0x0343, LOOP:2: B:292:0x05f1->B:294:0x05f7, LOOP_END, TryCatch #0 {HttpException -> 0x0343, blocks: (B:230:0x0468, B:269:0x0596, B:291:0x05cf, B:292:0x05f1, B:294:0x05f7, B:295:0x0605, B:290:0x05cb, B:189:0x0326, B:191:0x0332, B:195:0x033d, B:196:0x0342, B:199:0x0347, B:201:0x034b, B:202:0x0350, B:204:0x0358, B:207:0x0379, B:218:0x03f8, B:210:0x039e, B:213:0x03ab, B:214:0x03ba, B:216:0x03c5, B:217:0x03d4, B:219:0x03ff, B:221:0x0403, B:223:0x040c, B:224:0x041b, B:225:0x0437, B:227:0x043b, B:231:0x0471, B:233:0x0475, B:234:0x04ac, B:236:0x04b2, B:237:0x04c0, B:238:0x04d2, B:240:0x04d8, B:242:0x04e4, B:243:0x04e8, B:244:0x04fa, B:246:0x04fe, B:247:0x0502, B:249:0x0506, B:250:0x052f, B:251:0x0530, B:252:0x0535, B:253:0x0536, B:254:0x053b, B:255:0x053c, B:257:0x0546, B:259:0x0573, B:262:0x0579, B:264:0x057d, B:266:0x0586, B:271:0x059b, B:273:0x059f, B:276:0x05a4, B:277:0x05a9, B:279:0x05ac, B:282:0x05b1, B:285:0x05b6, B:286:0x05bb, B:287:0x05bc, B:428:0x079f, B:429:0x07a4), top: B:446:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
