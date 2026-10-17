package hw3;

import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.Keyword;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.ValidationViolation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di0.i f156091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f156092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f156093c;

    public w(di0.i textRecognizer, f0 pdfDocumentReader, y fileTypeDetector) {
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        Intrinsics.checkNotNullParameter(pdfDocumentReader, "pdfDocumentReader");
        Intrinsics.checkNotNullParameter(fileTypeDetector, "fileTypeDetector");
        this.f156091a = textRecognizer;
        this.f156092b = pdfDocumentReader;
        this.f156093c = fileTypeDetector;
    }

    public static ArrayList b(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Keyword keyword = (Keyword) it8.next();
            String str2 = keyword.f66470a;
            String str3 = keyword.f66472c;
            jv3.a aVar = keyword.f66471b;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            boolean zJ = kotlin.text.d0.J(lowerCase, lowerCase2, false);
            int i = t.f156086b[aVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (zJ) {
                    arrayList2.add(new ValidationViolation(str2, aVar, str3));
                }
            } else if (!zJ) {
                arrayList2.add(new ValidationViolation(str2, aVar, str3));
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
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
    public final java.lang.Object a(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof hw3.u
            if (r0 == 0) goto L13
            r0 = r9
            hw3.u r0 = (hw3.u) r0
            int r1 = r0.f156088x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156088x = r1
            goto L18
        L13:
            hw3.u r0 = new hw3.u
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156088x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            android.graphics.Bitmap r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r0 = move-exception
            r9 = r0
            goto L86
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8)
            di0.i r9 = r7.f156091a     // Catch: java.lang.Throwable -> L29
            kotlin.jvm.internal.Intrinsics.h(r8)     // Catch: java.lang.Throwable -> L29
            r0.u = r8     // Catch: java.lang.Throwable -> L29
            r0.f156088x = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r9 = r9.b(r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r9 != r1) goto L4b
            return r1
        L4b:
            di0.c r9 = (di0.c) r9     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r9 = r9.a()     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L29
        L5a:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L70
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L29
            eh0.b r1 = (eh0.b) r1     // Catch: java.lang.Throwable -> L29
            di0.b r1 = (di0.b) r1     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r1 = r1.a()     // Catch: java.lang.Throwable -> L29
            zhm.a0.x(r1, r0)     // Catch: java.lang.Throwable -> L29
            goto L5a
        L70:
            java.lang.String r1 = "\n"
            hu1.h0 r5 = new hu1.h0     // Catch: java.lang.Throwable -> L29
            r9 = 26
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L29
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r9 = zhm.d0.k0(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L29
            r8.recycle()
            return r9
        L86:
            r8.recycle()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.w.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r8 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof hw3.v
            if (r0 == 0) goto L13
            r0 = r8
            hw3.v r0 = (hw3.v) r0
            int r1 = r0.f156090x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156090x = r1
            goto L18
        L13:
            hw3.v r0 = new hw3.v
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156090x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            goto L70
        L2c:
            r6 = move-exception
            goto L95
        L2e:
            r6 = move-exception
            goto L9b
        L30:
            r6 = move-exception
            goto La1
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig r7 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            goto L7e
        L41:
            yhm.o.b(r8)
            hw3.y r8 = r5.f156093c     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r8.getClass()     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            hw3.o r8 = hw3.y.a(r6)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            int[] r2 = hw3.t.f156085a     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            int r8 = r8.ordinal()     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r8 = r2[r8]     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 == r4) goto L73
            if (r8 == r3) goto L63
            r6 = 3
            if (r8 != r6) goto L5d
            goto L8c
        L5d:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r6.<init>()     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            throw r6     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
        L63:
            hw3.f0 r8 = r5.f156092b     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r0.u = r7     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r0.f156090x = r3     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r8.b(r6, r0)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L70
            goto L7d
        L70:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            goto L80
        L73:
            r0.u = r7     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r0.f156090x = r4     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r5.a(r6, r0)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
        L80:
            java.util.ArrayList r6 = r7.f66469b     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            java.util.ArrayList r6 = b(r8, r6)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 == 0) goto L8f
        L8c:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$Valid r6 = com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult.Valid.f67946a
            return r6
        L8f:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$Invalid r7 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$Invalid     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            r7.<init>(r6)     // Catch: java.lang.Exception -> L2c com.revolut.feature.credit.application.plugins.impl.interactors.PasswordProtectedDocumentException -> L2e java.util.concurrent.CancellationException -> L30
            return r7
        L95:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$Error r7 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$Error
            r7.<init>(r6)
            goto La0
        L9b:
            com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$PasswordProtected r7 = new com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.models.DocumentValidationResult$PasswordProtected
            r7.<init>(r6)
        La0:
            return r7
        La1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.w.c(java.lang.String, com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.DocumentValidationConfig, gim.c):java.lang.Object");
    }
}
