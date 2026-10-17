package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.u;
import oim.n;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0001¨\u0006\u000b"}, d2 = {"populate", "", "Landroid/view/ViewStructure;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "packageName", "", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class PopulateViewStructure_androidKt {

    /* JADX INFO: renamed from: androidx.compose.ui.autofill.PopulateViewStructure_androidKt$populate$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "left", "", "top", "right", "bottom", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass7 extends u implements n {
        final /* synthetic */ AutofillApi26Helper $autofillApi;
        final /* synthetic */ ViewStructure $this_populate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AutofillApi26Helper autofillApi26Helper, ViewStructure viewStructure) {
            super(4);
            this.$autofillApi = autofillApi26Helper;
            this.$this_populate = viewStructure;
        }

        @Override // oim.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
            invoke(((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
            return Unit.f186387a;
        }

        public final void invoke(int i, int i2, int i3, int i5) {
            this.$autofillApi.setDimens(this.$this_populate, i, i2, 0, 0, i3 - i, i5 - i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static final void populate(@org.jetbrains.annotations.NotNull android.view.ViewStructure r38, @org.jetbrains.annotations.NotNull androidx.compose.ui.semantics.SemanticsInfo r39, @org.jetbrains.annotations.NotNull android.view.autofill.AutofillId r40, java.lang.String r41, @org.jetbrains.annotations.NotNull androidx.compose.ui.spatial.RectManager r42) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.PopulateViewStructure_androidKt.populate(android.view.ViewStructure, androidx.compose.ui.semantics.SemanticsInfo, android.view.autofill.AutofillId, java.lang.String, androidx.compose.ui.spatial.RectManager):void");
    }
}
