package vmj;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.R$string;
import dfj.e3;
import dfj.f3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vgg.a0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmj.h f290615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmj.f f290616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nij.b f290617c;

    public k(xmj.h contentMapper, xmj.f buttonsMapper, nij.b backgroundMapper) {
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(buttonsMapper, "buttonsMapper");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.f290615a = contentMapper;
        this.f290616b = buttonsMapper;
        this.f290617c = backgroundMapper;
    }

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
    public final o c(cli.j jVar) {
        QrCodeImage qrCodeImageA;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f290606a;
        ProfileCardModel profileCardModel = (ProfileCardModel) iii.c.f(data, new vjk.b(27), new a0(29), new vjh.c(this, 3));
        f3 f3Var = (f3) data.getContent();
        AnimatedBackgroundType.Esim esimA = null;
        if (f3Var != null) {
            xmj.d dVar = this.f290616b.f307281a;
            i80.a aVar = f3Var.f113964a;
            e3 e3Var = f3Var.f113966c;
            qrCodeImageA = dVar.a(aVar, e3Var != null ? e3Var.f113949a : null, xmj.a.SHARE);
        } else {
            qrCodeImageA = null;
        }
        List listK = v.k(xmj.f.a("ID_SAVE_BUTTON", R$string.esim_gifting_share_qr_code_action_save, R$drawable.uikit_icn_24_download, qrCodeImageA != null ? new e(qrCodeImageA) : null), xmj.f.a("ID_SHARE_BUTTON", R$string.esim_gifting_share_qr_code_action_share, R$drawable.uikit_icn_24_share, qrCodeImageA != null ? new f(qrCodeImageA) : null));
        f3 f3Var2 = (f3) data.getContent();
        if (f3Var2 != null) {
            e3 e3Var2 = f3Var2.f113966c;
            esimA = this.f290617c.a(e3Var2 != null ? e3Var2.d : null);
        }
        return new i(profileCardModel, listK, esimA);
    }
}
