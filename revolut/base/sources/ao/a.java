package ao;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.room.Room;
import com.revolut.analytics.db.AqueductDatabase;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherFragment;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlow;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import ljl.q1;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7838c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f7836a = i;
        this.f7837b = obj2;
        this.f7838c = obj3;
        this.d = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7836a;
        Object obj2 = this.d;
        Object obj3 = this.f7838c;
        Object obj4 = this.f7837b;
        switch (i) {
            case 0:
                return Room.databaseBuilder((Context) obj4, AqueductDatabase.class, "aqueduct.sqlite").addMigrations(new b()).fallbackToDestructiveMigration().openHelperFactory(new ce0.d(((bl0.g) ((de0.a) obj3)).a("aqueduct.sqlite", (String) obj2)));
            case 1:
                return new jri.f((iri.h) ((ii4.b) obj4).invoke(((ip.a) obj3).b()), (lm.c) obj2);
            case 2:
                koi.i iVar = (koi.i) obj4;
                iVar.d = null;
                iVar.getItems().clear();
                iVar.getItems().addAll((List) obj3);
                ((DiffUtil.DiffResult) obj2).dispatchUpdatesTo(iVar.f186376a);
                return Unit.f186387a;
            case 3:
                return Room.databaseBuilder((Context) obj4, TransactionsDatabase.class, "transactions_db").addMigrations(new qif.d()).addMigrations(new qif.e()).addMigrations(new qif.j()).addMigrations(new qif.a()).addMigrations(new qif.b()).addMigrations(new qif.c()).addMigrations(new qif.f()).addMigrations(new qif.g()).openHelperFactory(new ce0.d(((bl0.g) ((de0.a) obj3)).a("transactions_db", ((yk0.a) obj2).getToken())));
            default:
                xhi.c cVar = (xhi.c) obj4;
                KompotFlow kompotFlow = (KompotFlow) obj3;
                KProperty[] kPropertyArr = KompotFlow.g0;
                xhi.a aVar = new xhi.a();
                shi.a aVarF = cVar.f();
                aVarF.getClass();
                aVar.f306240b = aVarF;
                fsi.g gVarA = cVar.a();
                gVarA.getClass();
                aVar.f306241c = gVarA;
                e81.a aVarI = cVar.i();
                aVarI.getClass();
                aVar.d = aVarI;
                ite.a aVarE = cVar.e();
                aVarE.getClass();
                aVar.e = aVarE;
                osb.a aVarG = cVar.g();
                aVarG.getClass();
                aVar.f = aVarG;
                KompotFlowContract$Configuration config = cVar.getConfig();
                config.getClass();
                aVar.k = config;
                Activity activityM2 = kompotFlow.m2();
                activityM2.getClass();
                aVar.f306244j = activityM2;
                cri.b bVarH = cVar.h();
                bVarH.getClass();
                aVar.f306242g = bVarH;
                asi.b bVarM = cVar.m();
                bVarM.getClass();
                aVar.f306243h = bVarM;
                q1 q1VarK = cVar.k();
                q1VarK.getClass();
                aVar.i = q1VarK;
                aVar.f306245l = (KompotLauncherFragment) obj2;
                aVar.f306239a = kompotFlow;
                s.h(aVar.f306240b, shi.a.class);
                s.h(aVar.f306241c, fsi.g.class);
                s.h(aVar.d, e81.a.class);
                s.h(aVar.e, ite.a.class);
                s.h(aVar.f, osb.a.class);
                s.h(aVar.f306242g, cri.b.class);
                s.h(aVar.f306243h, asi.b.class);
                s.h(aVar.i, q1.class);
                s.h(aVar.f306244j, Context.class);
                s.h(aVar.k, KompotFlowContract$Configuration.class);
                s.h(aVar.f306245l, Fragment.class);
                return new xhi.b(aVar.f306240b, aVar.f306241c, aVar.d, aVar.e, aVar.f, aVar.f306242g, aVar.f306243h, aVar.i, aVar.f306239a, aVar.f306244j, aVar.k, aVar.f306245l);
        }
    }
}
