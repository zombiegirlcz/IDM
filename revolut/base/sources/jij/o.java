package jij;

import kotlin.jvm.internal.Intrinsics;
import nij.p;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iij.b f174588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hij.e f174589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nij.f f174590c;
    public final nij.b d;

    public o(iij.b headerResourceConfigProvider, hij.e footerStateMapper, p tabsConfigMapper, nij.f contentMapper, nij.b backgroundMapper) {
        Intrinsics.checkNotNullParameter(headerResourceConfigProvider, "headerResourceConfigProvider");
        Intrinsics.checkNotNullParameter(footerStateMapper, "footerStateMapper");
        Intrinsics.checkNotNullParameter(tabsConfigMapper, "tabsConfigMapper");
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.f174588a = headerResourceConfigProvider;
        this.f174589b = footerStateMapper;
        this.f174590c = contentMapper;
        this.d = backgroundMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ee A[SYNTHETIC] */
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
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r21) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jij.o.c(cli.j):cli.o");
    }
}
