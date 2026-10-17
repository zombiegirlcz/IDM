package eq5;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yp5.f f128291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f128292b;

    public m1(yp5.f itemsMapper, x0 interactor) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f128291a = itemsMapper;
        this.f128292b = interactor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        z zVar;
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.e;
        Data data2 = domainState.k;
        Data data3 = domainState.f128310g;
        Data data4 = domainState.f128315n;
        Data data5 = domainState.o;
        xi0.b bVar = domainState.f128308b;
        nqi.c cVar = domainState.f;
        wk5.a aVar = domainState.f128309c;
        y yVar = null;
        List list = (List) iii.c.f(t1.x(data, data2, data3, data4, data5, new Data((bVar == null || cVar == null || aVar == null) ? null : new yhm.r(bVar, cVar, aVar), null, false, 6, null)), new eq4.g(this, 3), new a8a.a(this, domainState, 29), new dn8.k(this, domainState, 19));
        boolean z = domainState.d;
        CryptoAddress cryptoAddress = (CryptoAddress) data.getContent();
        if (cryptoAddress != null) {
            yp5.f fVar = this.f128291a;
            TextClause textClauseJ = fVar.j(cryptoAddress, z);
            TextClause textClauseI = fVar.i(cryptoAddress);
            Image imageG = fVar.g(cryptoAddress, z);
            Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
            Image imageB = z ? null : ((bp5.b) fVar.f315791b).b(cryptoAddress);
            zVar = new z(textClauseJ, textClauseI, new AvatarModel.Default(imageG, null, null, null, imageB != null ? new AvatarModel.BadgeModel(new RawImageBadge(imageB), com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG));
        } else {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            zVar = new z(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);
        }
        CryptoAddress cryptoAddress2 = (CryptoAddress) data.getContent();
        if (cryptoAddress2 != null) {
            Intrinsics.checkNotNullParameter(cryptoAddress2, "cryptoAddress");
            yVar = new y(new TextLocalisedClause(R$string.crypto_withdrawals_screen_create_withdrawal_review_transfer_button_title, null, null, 14), Intrinsics.f(domainState.f128315n.getContent(), m.f128289a));
        }
        return new a0(list, zVar, yVar);
    }
}
