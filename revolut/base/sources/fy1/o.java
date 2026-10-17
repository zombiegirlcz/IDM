package fy1;

import blj.t;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import skm.e0;
import vkm.z1;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class o implements lx1.d {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx1.i f138868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cz5.b f138869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fl3.a f138870c;
    public final e8.r d;
    public final e8.r e;

    static {
        h0 h0Var = new h0(o.class, "updateAllFlow", "getUpdateAllFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(o.class, "updateFlow", "getUpdateFlow()Lkotlinx/coroutines/flow/MutableSharedFlow;", 0, p0Var)};
    }

    public o(nx1.i repository, cz5.b apmContactsProviderMap, fl3.a contactsRepository, final CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apmContactsProviderMap, "apmContactsProviderMap");
        Intrinsics.checkNotNullParameter(contactsRepository, "contactsRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f138868a = repository;
        this.f138869b = apmContactsProviderMap;
        this.f138870c = contactsRepository;
        final int i = 0;
        this.d = new e8.r(new Function0() { // from class: fy1.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        z1 z1VarB = vkm.q.b(0, 6, null);
                        e0.C(coroutineScope, null, null, new n(this, z1VarB, null, 0), 3);
                        return z1VarB;
                    default:
                        z1 z1VarB2 = vkm.q.b(0, 6, null);
                        e0.C(coroutineScope, null, null, new n(this, z1VarB2, null, 1), 3);
                        return z1VarB2;
                }
            }
        });
        final int i2 = 1;
        this.e = new e8.r(new Function0() { // from class: fy1.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        z1 z1VarB = vkm.q.b(0, 6, null);
                        e0.C(coroutineScope, null, null, new n(this, z1VarB, null, 0), 3);
                        return z1VarB;
                    default:
                        z1 z1VarB2 = vkm.q.b(0, 6, null);
                        e0.C(coroutineScope, null, null, new n(this, z1VarB2, null, 1), 3);
                        return z1VarB2;
                }
            }
        });
    }

    public static final ArrayList a(o oVar, List list) {
        zm3.a aVarE;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            zm3.a aVar = (zm3.a) it8.next();
            if (aVar instanceof zm3.f) {
                aVarE = (zm3.g) aVar;
            } else if (aVar instanceof zm3.i) {
                aVarE = ((zm3.i) aVar).e();
            } else if (aVar instanceof zm3.e) {
                aVarE = (zm3.g) aVar;
            } else {
                if (!(aVar instanceof zm3.j) && !(aVar instanceof zm3.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarE = null;
            }
            if (aVarE != null) {
                arrayList.add(aVarE);
            }
        }
        return arrayList;
    }

    public static final Object b(o oVar, z1 z1Var, gim.i iVar) {
        Object objCollect = vkm.q.i(yh5.b.d(z1Var, rd0.e.b(m70.a.g(((sl3.k) oVar.f138870c).g(), new fv0.c(14), null, 2))), 1, ukm.f.DROP_OLDEST).collect(new t(oVar, 3), iVar);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    public static nx1.d f(ApmContact apmContact) {
        return apmContact != null ? new nx1.c(apmContact) : new nx1.a((Integer) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01f9 A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:30:0x0075, B:32:0x0079, B:34:0x007d, B:36:0x0081, B:37:0x0089, B:38:0x008c, B:39:0x0091, B:40:0x0092, B:42:0x009e, B:44:0x00a6, B:45:0x00aa, B:47:0x00af, B:49:0x00bb, B:51:0x00c3, B:53:0x00c7, B:54:0x00ca, B:55:0x00ce, B:57:0x00d3, B:59:0x00df, B:61:0x00e7, B:62:0x00eb, B:64:0x00f0, B:66:0x00fd, B:68:0x0103, B:70:0x010b, B:72:0x0111, B:74:0x011d, B:76:0x0123, B:78:0x0129, B:80:0x012f, B:82:0x013b, B:84:0x0143, B:86:0x0147, B:87:0x014a, B:88:0x014e, B:90:0x0153, B:92:0x015f, B:94:0x0167, B:96:0x016b, B:97:0x016e, B:98:0x0172, B:100:0x0177, B:102:0x0183, B:104:0x018b, B:105:0x018f, B:107:0x0194, B:109:0x01a0, B:111:0x01a8, B:113:0x01ac, B:114:0x01af, B:115:0x01b3, B:117:0x01b8, B:119:0x01c4, B:121:0x01cc, B:123:0x01d0, B:124:0x01d3, B:125:0x01d7, B:127:0x01dc, B:129:0x01e8, B:131:0x01f0, B:132:0x01f4, B:134:0x01f9, B:20:0x003e, B:26:0x0054, B:23:0x0045), top: B:138:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:30:0x0075, B:32:0x0079, B:34:0x007d, B:36:0x0081, B:37:0x0089, B:38:0x008c, B:39:0x0091, B:40:0x0092, B:42:0x009e, B:44:0x00a6, B:45:0x00aa, B:47:0x00af, B:49:0x00bb, B:51:0x00c3, B:53:0x00c7, B:54:0x00ca, B:55:0x00ce, B:57:0x00d3, B:59:0x00df, B:61:0x00e7, B:62:0x00eb, B:64:0x00f0, B:66:0x00fd, B:68:0x0103, B:70:0x010b, B:72:0x0111, B:74:0x011d, B:76:0x0123, B:78:0x0129, B:80:0x012f, B:82:0x013b, B:84:0x0143, B:86:0x0147, B:87:0x014a, B:88:0x014e, B:90:0x0153, B:92:0x015f, B:94:0x0167, B:96:0x016b, B:97:0x016e, B:98:0x0172, B:100:0x0177, B:102:0x0183, B:104:0x018b, B:105:0x018f, B:107:0x0194, B:109:0x01a0, B:111:0x01a8, B:113:0x01ac, B:114:0x01af, B:115:0x01b3, B:117:0x01b8, B:119:0x01c4, B:121:0x01cc, B:123:0x01d0, B:124:0x01d3, B:125:0x01d7, B:127:0x01dc, B:129:0x01e8, B:131:0x01f0, B:132:0x01f4, B:134:0x01f9, B:20:0x003e, B:26:0x0054, B:23:0x0045), top: B:138:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:30:0x0075, B:32:0x0079, B:34:0x007d, B:36:0x0081, B:37:0x0089, B:38:0x008c, B:39:0x0091, B:40:0x0092, B:42:0x009e, B:44:0x00a6, B:45:0x00aa, B:47:0x00af, B:49:0x00bb, B:51:0x00c3, B:53:0x00c7, B:54:0x00ca, B:55:0x00ce, B:57:0x00d3, B:59:0x00df, B:61:0x00e7, B:62:0x00eb, B:64:0x00f0, B:66:0x00fd, B:68:0x0103, B:70:0x010b, B:72:0x0111, B:74:0x011d, B:76:0x0123, B:78:0x0129, B:80:0x012f, B:82:0x013b, B:84:0x0143, B:86:0x0147, B:87:0x014a, B:88:0x014e, B:90:0x0153, B:92:0x015f, B:94:0x0167, B:96:0x016b, B:97:0x016e, B:98:0x0172, B:100:0x0177, B:102:0x0183, B:104:0x018b, B:105:0x018f, B:107:0x0194, B:109:0x01a0, B:111:0x01a8, B:113:0x01ac, B:114:0x01af, B:115:0x01b3, B:117:0x01b8, B:119:0x01c4, B:121:0x01cc, B:123:0x01d0, B:124:0x01d3, B:125:0x01d7, B:127:0x01dc, B:129:0x01e8, B:131:0x01f0, B:132:0x01f4, B:134:0x01f9, B:20:0x003e, B:26:0x0054, B:23:0x0045), top: B:138:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(n02.b r8, com.revolut.feature.apm.core.models.recipients.ApmDescriptor r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.o.c(n02.b, com.revolut.feature.apm.core.models.recipients.ApmDescriptor, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x02eb A[Catch: Exception -> 0x02ee, TRY_LEAVE, TryCatch #0 {Exception -> 0x02ee, blocks: (B:13:0x002d, B:28:0x007b, B:30:0x007f, B:32:0x0083, B:34:0x0087, B:35:0x008a, B:37:0x008e, B:38:0x0098, B:39:0x009b, B:40:0x00a0, B:41:0x00a1, B:43:0x00ad, B:44:0x00bc, B:46:0x00c2, B:48:0x00ca, B:50:0x00d3, B:49:0x00cf, B:52:0x00d8, B:54:0x00db, B:56:0x00e7, B:57:0x00f6, B:59:0x00fc, B:61:0x0104, B:63:0x010d, B:62:0x0109, B:65:0x0112, B:67:0x0115, B:69:0x0121, B:70:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0147, B:75:0x0143, B:78:0x014c, B:80:0x014f, B:82:0x015b, B:84:0x0161, B:85:0x0170, B:87:0x0176, B:89:0x017e, B:91:0x0187, B:90:0x0183, B:93:0x018c, B:95:0x018f, B:97:0x019b, B:98:0x01aa, B:100:0x01b0, B:102:0x01b8, B:104:0x01c1, B:103:0x01bd, B:106:0x01c6, B:108:0x01c9, B:110:0x01d5, B:111:0x01e4, B:113:0x01ea, B:115:0x01f2, B:117:0x01fb, B:116:0x01f7, B:119:0x0200, B:121:0x0203, B:123:0x020f, B:124:0x021e, B:126:0x0224, B:128:0x022c, B:130:0x0235, B:129:0x0231, B:132:0x023a, B:134:0x023d, B:136:0x0249, B:137:0x0258, B:139:0x025e, B:141:0x0266, B:143:0x026f, B:142:0x026b, B:145:0x0274, B:147:0x0277, B:149:0x0283, B:150:0x0292, B:152:0x0298, B:154:0x02a0, B:156:0x02a9, B:155:0x02a5, B:158:0x02ae, B:160:0x02b1, B:162:0x02bd, B:163:0x02cc, B:165:0x02d2, B:167:0x02da, B:169:0x02e3, B:168:0x02df, B:171:0x02e8, B:173:0x02eb, B:18:0x003f, B:24:0x0057, B:21:0x0046), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:13:0x002d, B:28:0x007b, B:30:0x007f, B:32:0x0083, B:34:0x0087, B:35:0x008a, B:37:0x008e, B:38:0x0098, B:39:0x009b, B:40:0x00a0, B:41:0x00a1, B:43:0x00ad, B:44:0x00bc, B:46:0x00c2, B:48:0x00ca, B:50:0x00d3, B:49:0x00cf, B:52:0x00d8, B:54:0x00db, B:56:0x00e7, B:57:0x00f6, B:59:0x00fc, B:61:0x0104, B:63:0x010d, B:62:0x0109, B:65:0x0112, B:67:0x0115, B:69:0x0121, B:70:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0147, B:75:0x0143, B:78:0x014c, B:80:0x014f, B:82:0x015b, B:84:0x0161, B:85:0x0170, B:87:0x0176, B:89:0x017e, B:91:0x0187, B:90:0x0183, B:93:0x018c, B:95:0x018f, B:97:0x019b, B:98:0x01aa, B:100:0x01b0, B:102:0x01b8, B:104:0x01c1, B:103:0x01bd, B:106:0x01c6, B:108:0x01c9, B:110:0x01d5, B:111:0x01e4, B:113:0x01ea, B:115:0x01f2, B:117:0x01fb, B:116:0x01f7, B:119:0x0200, B:121:0x0203, B:123:0x020f, B:124:0x021e, B:126:0x0224, B:128:0x022c, B:130:0x0235, B:129:0x0231, B:132:0x023a, B:134:0x023d, B:136:0x0249, B:137:0x0258, B:139:0x025e, B:141:0x0266, B:143:0x026f, B:142:0x026b, B:145:0x0274, B:147:0x0277, B:149:0x0283, B:150:0x0292, B:152:0x0298, B:154:0x02a0, B:156:0x02a9, B:155:0x02a5, B:158:0x02ae, B:160:0x02b1, B:162:0x02bd, B:163:0x02cc, B:165:0x02d2, B:167:0x02da, B:169:0x02e3, B:168:0x02df, B:171:0x02e8, B:173:0x02eb, B:18:0x003f, B:24:0x0057, B:21:0x0046), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:13:0x002d, B:28:0x007b, B:30:0x007f, B:32:0x0083, B:34:0x0087, B:35:0x008a, B:37:0x008e, B:38:0x0098, B:39:0x009b, B:40:0x00a0, B:41:0x00a1, B:43:0x00ad, B:44:0x00bc, B:46:0x00c2, B:48:0x00ca, B:50:0x00d3, B:49:0x00cf, B:52:0x00d8, B:54:0x00db, B:56:0x00e7, B:57:0x00f6, B:59:0x00fc, B:61:0x0104, B:63:0x010d, B:62:0x0109, B:65:0x0112, B:67:0x0115, B:69:0x0121, B:70:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0147, B:75:0x0143, B:78:0x014c, B:80:0x014f, B:82:0x015b, B:84:0x0161, B:85:0x0170, B:87:0x0176, B:89:0x017e, B:91:0x0187, B:90:0x0183, B:93:0x018c, B:95:0x018f, B:97:0x019b, B:98:0x01aa, B:100:0x01b0, B:102:0x01b8, B:104:0x01c1, B:103:0x01bd, B:106:0x01c6, B:108:0x01c9, B:110:0x01d5, B:111:0x01e4, B:113:0x01ea, B:115:0x01f2, B:117:0x01fb, B:116:0x01f7, B:119:0x0200, B:121:0x0203, B:123:0x020f, B:124:0x021e, B:126:0x0224, B:128:0x022c, B:130:0x0235, B:129:0x0231, B:132:0x023a, B:134:0x023d, B:136:0x0249, B:137:0x0258, B:139:0x025e, B:141:0x0266, B:143:0x026f, B:142:0x026b, B:145:0x0274, B:147:0x0277, B:149:0x0283, B:150:0x0292, B:152:0x0298, B:154:0x02a0, B:156:0x02a9, B:155:0x02a5, B:158:0x02ae, B:160:0x02b1, B:162:0x02bd, B:163:0x02cc, B:165:0x02d2, B:167:0x02da, B:169:0x02e3, B:168:0x02df, B:171:0x02e8, B:173:0x02eb, B:18:0x003f, B:24:0x0057, B:21:0x0046), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[Catch: Exception -> 0x02ee, TryCatch #0 {Exception -> 0x02ee, blocks: (B:13:0x002d, B:28:0x007b, B:30:0x007f, B:32:0x0083, B:34:0x0087, B:35:0x008a, B:37:0x008e, B:38:0x0098, B:39:0x009b, B:40:0x00a0, B:41:0x00a1, B:43:0x00ad, B:44:0x00bc, B:46:0x00c2, B:48:0x00ca, B:50:0x00d3, B:49:0x00cf, B:52:0x00d8, B:54:0x00db, B:56:0x00e7, B:57:0x00f6, B:59:0x00fc, B:61:0x0104, B:63:0x010d, B:62:0x0109, B:65:0x0112, B:67:0x0115, B:69:0x0121, B:70:0x0130, B:72:0x0136, B:74:0x013e, B:76:0x0147, B:75:0x0143, B:78:0x014c, B:80:0x014f, B:82:0x015b, B:84:0x0161, B:85:0x0170, B:87:0x0176, B:89:0x017e, B:91:0x0187, B:90:0x0183, B:93:0x018c, B:95:0x018f, B:97:0x019b, B:98:0x01aa, B:100:0x01b0, B:102:0x01b8, B:104:0x01c1, B:103:0x01bd, B:106:0x01c6, B:108:0x01c9, B:110:0x01d5, B:111:0x01e4, B:113:0x01ea, B:115:0x01f2, B:117:0x01fb, B:116:0x01f7, B:119:0x0200, B:121:0x0203, B:123:0x020f, B:124:0x021e, B:126:0x0224, B:128:0x022c, B:130:0x0235, B:129:0x0231, B:132:0x023a, B:134:0x023d, B:136:0x0249, B:137:0x0258, B:139:0x025e, B:141:0x0266, B:143:0x026f, B:142:0x026b, B:145:0x0274, B:147:0x0277, B:149:0x0283, B:150:0x0292, B:152:0x0298, B:154:0x02a0, B:156:0x02a9, B:155:0x02a5, B:158:0x02ae, B:160:0x02b1, B:162:0x02bd, B:163:0x02cc, B:165:0x02d2, B:167:0x02da, B:169:0x02e3, B:168:0x02df, B:171:0x02e8, B:173:0x02eb, B:18:0x003f, B:24:0x0057, B:21:0x0046), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(n02.b r8, com.revolut.feature.apm.core.models.recipients.ApmDescriptor r9, java.lang.String r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.o.d(n02.b, com.revolut.feature.apm.core.models.recipients.ApmDescriptor, java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006c -> B:27:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof fy1.l
            if (r0 == 0) goto L13
            r0 = r10
            fy1.l r0 = (fy1.l) r0
            int r1 = r0.f138864y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138864y = r1
            goto L18
        L13:
            fy1.l r0 = new fy1.l
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f138862w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138864y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.util.Iterator r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L6f
        L3b:
            yhm.o.b(r10)
            kotlin.enums.EnumEntries r10 = n02.b.b()
            java.util.Iterator r10 = r10.iterator()
            r7 = r10
            r10 = r9
            r9 = r7
        L49:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r9.next()
            n02.b r2 = (n02.b) r2
            r0.u = r10
            r0.v = r9
            r0.f138864y = r4
            cz5.b r6 = r8.f138869b
            ky1.a r2 = r6.b(r2)
            if (r2 == 0) goto L68
            java.lang.Object r2 = r2.c(r10, r0)
            goto L69
        L68:
            r2 = r5
        L69:
            if (r2 != r1) goto L6c
            goto L88
        L6c:
            r7 = r2
            r2 = r10
            r10 = r7
        L6f:
            com.revolut.feature.apm.core.models.recipients.ApmContact r10 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r10
            if (r10 == 0) goto L74
            goto L78
        L74:
            r10 = r2
            goto L49
        L76:
            r2 = r10
            r10 = r5
        L78:
            if (r10 != 0) goto L8a
            r0.u = r5
            r0.v = r5
            r0.f138864y = r3
            nx1.i r9 = r8.f138868a
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L89
        L88:
            return r1
        L89:
            return r9
        L8a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fy1.o.e(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object g(n02.b bVar, gim.c cVar) {
        Object objEmit = ((MutableSharedFlow) this.e.b(f[1])).emit(u.c(bVar), cVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
