package g31;

import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryEntity;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import j6k.j;
import j6k.k;
import j6k.o;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140168a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f140169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f140170c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f140171g;

    public /* synthetic */ d(Data data, DateTime dateTime, o oVar, Set set, od0.i iVar, String str) {
        this.f140170c = data;
        this.d = dateTime;
        this.e = oVar;
        this.f = set;
        this.f140171g = iVar;
        this.f140169b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f140168a) {
            case 0:
                h hVar = (h) this.f140170c;
                CategoryColor categoryColor = (CategoryColor) this.d;
                CategoryImage categoryImage = (CategoryImage) this.e;
                String str2 = (String) this.f;
                String str3 = (String) this.f140171g;
                TransactionCustomCategoryDao transactionCustomCategoryDao = hVar.f140180b;
                String strH = u1.h(categoryColor, CustomTransactionCategoryMapperKt.getTransactionCategoryColorMapper());
                String str4 = strH == null ? "" : strH;
                String strH2 = u1.h(categoryImage, CustomTransactionCategoryMapperKt.getTransactionCategoryImageMapper());
                String str5 = strH2 == null ? "" : strH2;
                String str6 = this.f140169b;
                transactionCustomCategoryDao.insert(new TransactionCustomCategoryEntity(str2, str6, str3, str5, str4));
                hVar.d(str6);
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.f140170c;
                DateTime dateTime = (DateTime) this.d;
                o oVar = (o) this.e;
                Set set = (Set) this.f;
                od0.i iVar = (od0.i) this.f140171g;
                List list = (List) data.getContent();
                if (list == null) {
                    return null;
                }
                ArrayList arrayListF1 = d0.f1(list);
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f140169b;
                    if (!zHasNext) {
                        i = -1;
                    } else if (!Intrinsics.f(((MoneyRequest) it8.next()).f60314a, str)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    MoneyRequest moneyRequestA = MoneyRequest.a((MoneyRequest) arrayListF1.remove(i), dateTime, null, null, 261887);
                    arrayListF1.add(moneyRequestA);
                    w4l.f fVar = oVar.f171821h;
                    Intrinsics.h(set);
                    fVar.j(new j((String) iVar.g(), set), arrayListF1);
                    oVar.i.j(new k(str, (String) iVar.g(), set), moneyRequestA);
                }
                return Unit.f186387a;
            default:
                pv9.i iVar2 = (pv9.i) this.f140170c;
                PrivateKey privateKey = (PrivateKey) this.d;
                PublicKey publicKey = (PublicKey) this.e;
                String str7 = (String) this.f;
                String str8 = (String) this.f140171g;
                String str9 = this.f140169b;
                if (str9 == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar2 = od0.i.Companion;
                SecretKeySpec secretKeySpecE = ((pv9.d) iVar2.d).e(str9, privateKey, publicKey, str7, str8);
                hVar2.getClass();
                return od0.h.a(secretKeySpecE);
        }
    }

    public /* synthetic */ d(h hVar, CategoryColor categoryColor, CategoryImage categoryImage, String str, String str2, String str3) {
        this.f140170c = hVar;
        this.d = categoryColor;
        this.e = categoryImage;
        this.f140169b = str;
        this.f = str2;
        this.f140171g = str3;
    }

    public /* synthetic */ d(String str, pv9.i iVar, PrivateKey privateKey, PublicKey publicKey, String str2, String str3) {
        this.f140169b = str;
        this.f140170c = iVar;
        this.d = privateKey;
        this.e = publicKey;
        this.f = str2;
        this.f140171g = str3;
    }
}
