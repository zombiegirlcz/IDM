package tif;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f271498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f271499c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BreadcrumbException e;

    public /* synthetic */ f(q qVar, String str, String str2, BreadcrumbException breadcrumbException, int i) {
        this.f271497a = i;
        this.f271498b = qVar;
        this.f271499c = str;
        this.d = str2;
        this.e = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f271497a) {
            case 0:
                q qVar = this.f271498b;
                final mif.o oVar = qVar.f271519c;
                oVar.getClass();
                final String groupId = this.f271499c;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                final String comment = this.d;
                Intrinsics.checkNotNullParameter(comment, "comment");
                final int i = 1;
                pfm.h hVar = new pfm.h(new kfm.a() { // from class: mif.k
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                oVar.z(groupId, comment);
                                break;
                            default:
                                o oVar2 = oVar;
                                oVar2.e();
                                String groupId2 = groupId;
                                Intrinsics.checkNotNullParameter(groupId2, "groupId");
                                String comment2 = comment;
                                Intrinsics.checkNotNullParameter(comment2, "comment");
                                String strC = e0.c(comment2);
                                oVar2.y(new SimpleSQLiteQuery(v0.a.i(v0.a.m("\n            WITH temp_table AS(\n                SELECT leg_id\n                FROM transactions\n                WHERE group_id = \"", groupId2, "\"\n            )\n            INSERT INTO extra_attributes (extra_attr_leg_id, extra_attr_user_comment)\n                SELECT leg_id, ", strC, "\n                FROM temp_table\n                WHERE true\n            ON CONFLICT(extra_attr_leg_id) DO UPDATE SET extra_attr_user_comment="), e0.c(comment2), "\n            ")));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                t tVarW = oVar.w(hVar);
                Intrinsics.checkNotNullExpressionValue(tVarW, "triggerUpdate(...)");
                return qVar.f(tVarW, this.e);
            default:
                q qVar2 = this.f271498b;
                final mif.o oVar2 = qVar2.f271519c;
                oVar2.getClass();
                final String groupId2 = this.f271499c;
                Intrinsics.checkNotNullParameter(groupId2, "groupId");
                final String fraudState = this.d;
                Intrinsics.checkNotNullParameter(fraudState, "fraudState");
                final int i2 = 0;
                pfm.h hVar2 = new pfm.h(new kfm.a() { // from class: mif.k
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                oVar2.z(groupId2, fraudState);
                                break;
                            default:
                                o oVar22 = oVar2;
                                oVar22.e();
                                String groupId22 = groupId2;
                                Intrinsics.checkNotNullParameter(groupId22, "groupId");
                                String comment2 = fraudState;
                                Intrinsics.checkNotNullParameter(comment2, "comment");
                                String strC = e0.c(comment2);
                                oVar22.y(new SimpleSQLiteQuery(v0.a.i(v0.a.m("\n            WITH temp_table AS(\n                SELECT leg_id\n                FROM transactions\n                WHERE group_id = \"", groupId22, "\"\n            )\n            INSERT INTO extra_attributes (extra_attr_leg_id, extra_attr_user_comment)\n                SELECT leg_id, ", strC, "\n                FROM temp_table\n                WHERE true\n            ON CONFLICT(extra_attr_leg_id) DO UPDATE SET extra_attr_user_comment="), e0.c(comment2), "\n            ")));
                                break;
                        }
                    }
                }, 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                t tVarW2 = oVar2.w(hVar2);
                Intrinsics.checkNotNullExpressionValue(tVarW2, "triggerUpdate(...)");
                return qVar2.f(tVarW2, this.e);
        }
    }
}
