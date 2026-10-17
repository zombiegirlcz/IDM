package z20;

import com.revolut.chat.data.network.MessagesApi;
import com.revolut.chat.data.repository.messages.upload.UploadExpiredException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagesApi f318914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f318915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f318916c;

    public g(MessagesApi messagesApi, t imageFileConverter, u progressTracker) {
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(imageFileConverter, "imageFileConverter");
        Intrinsics.checkNotNullParameter(progressTracker, "progressTracker");
        this.f318914a = messagesApi;
        this.f318915b = imageFileConverter;
        this.f318916c = progressTracker;
    }

    public static void a(List list, u10.n nVar) throws UploadExpiredException {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            o20.c error = ((o20.d) next).getError();
            if (error != null && error.getCode() == 800) {
                break;
            }
        }
        if (((o20.d) next) != null) {
            throw new UploadExpiredException(nVar.f276309a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x005f, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:40:0x008a, B:41:0x008f, B:42:0x0090), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:27:0x005f, B:36:0x007d, B:37:0x0080, B:38:0x0081, B:40:0x008a, B:41:0x008f, B:42:0x0090), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, z20.e] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z20.d r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof z20.e
            if (r0 == 0) goto L13
            r0 = r11
            z20.e r0 = (z20.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            z20.e r0 = new z20.e
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f318910x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 0
            r4 = 1
            z20.u r5 = r9.f318916c
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.util.UUID r10 = r0.f318909w
            u10.n r1 = r0.v
            z20.d r0 = r0.u
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33 com.revolut.core.error.data.model.ServerErrorException -> L35
            goto L5f
        L30:
            r10 = move-exception
            goto L91
        L33:
            r11 = move-exception
            goto L7d
        L35:
            r11 = move-exception
            goto L81
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            yhm.o.b(r11)
            u10.n r11 = r10.f318906a
            java.util.UUID r2 = r11.f276309a
            com.revolut.chat.data.network.MessagesApi r6 = r9.f318914a     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            java.util.UUID r7 = r11.f276310b     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            okhttp3.c r8 = r10.f318907b     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            r0.u = r10     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            r0.v = r11     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            r0.f318909w = r2     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            r0.z = r4     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            java.lang.Object r0 = r6.uploadContent(r7, r8, r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75 com.revolut.core.error.data.model.ServerErrorException -> L79
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r1 = r11
            r11 = r0
            r0 = r10
            r10 = r2
        L5f:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33 com.revolut.core.error.data.model.ServerErrorException -> L35
            a(r11, r1)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33 com.revolut.core.error.data.model.ServerErrorException -> L35
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.b(r10, r11)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L33 com.revolut.core.error.data.model.ServerErrorException -> L35
            skm.r r10 = r0.f318908c
            kotlin.Unit r11 = kotlin.Unit.f186387a
            r10.U(r11)
            return r11
        L71:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L91
        L75:
            r11 = move-exception
            r0 = r10
            r10 = r2
            goto L7d
        L79:
            r11 = move-exception
            r0 = r10
            r10 = r2
            goto L81
        L7d:
            r5.b(r10, r3)     // Catch: java.lang.Throwable -> L30
            throw r11     // Catch: java.lang.Throwable -> L30
        L81:
            r5.b(r10, r3)     // Catch: java.lang.Throwable -> L30
            int r10 = r11.e     // Catch: java.lang.Throwable -> L30
            r1 = 403(0x193, float:5.65E-43)
            if (r10 != r1) goto L90
            com.revolut.chat.data.repository.messages.upload.SessionExpiredException r10 = new com.revolut.chat.data.repository.messages.upload.SessionExpiredException     // Catch: java.lang.Throwable -> L30
            r10.<init>()     // Catch: java.lang.Throwable -> L30
            throw r10     // Catch: java.lang.Throwable -> L30
        L90:
            throw r11     // Catch: java.lang.Throwable -> L30
        L91:
            skm.r r11 = r0.f318908c
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r11.U(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.g.b(z20.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(u10.n r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.g.c(u10.n, gim.c):java.lang.Object");
    }
}
