package k50;

import androidx.lifecycle.Lifecycle;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.chat.ui.outage.OngoingOutageScreen;
import com.revolut.chat_core.R$string;
import com.revolut.core.chaosmanagement.ui.model.ChaosManagementIncidentUiItem;
import com.revolut.feature.image_gallery.ImageGalleryController;
import com.revolut.kompot.common.ModalDestination;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class u1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181255b;

    public /* synthetic */ u1(MessagesScreen messagesScreen, int i) {
        this.f181254a = i;
        this.f181255b = messagesScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        String fallbackText;
        Instant time;
        int i = this.f181254a;
        int i2 = 16;
        int i3 = -1;
        Continuation continuation = null;
        int i5 = 1;
        MessagesScreen messagesScreen = this.f181255b;
        switch (i) {
            case 0:
                kp0.b1 it8 = (kp0.b1) obj2;
                MessagesScreen.a aVar = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i6 = it8.d;
                String listId = it8.f187973a;
                if (i6 == 1) {
                    ((j4) messagesScreen.h3()).l3(it8.e, listId, null);
                } else if (i6 == 2) {
                    j4 j4Var = (j4) messagesScreen.h3();
                    j4Var.getClass();
                    Intrinsics.checkNotNullParameter(listId, "listId");
                    v20.j0 j0VarC3 = j4Var.f181123b0.c3(listId);
                    if (j0VarC3 != null && (fallbackText = j0VarC3.getFallbackText()) != null) {
                        j4Var.k3(R$string.chat_messages_copied, fallbackText);
                    }
                }
                break;
            case 1:
                mx0.d4 recordState = (mx0.d4) obj2;
                MessagesScreen.a aVar2 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(recordState, "recordState");
                w0 w0VarH3 = messagesScreen.h3();
                z = recordState == mx0.d4.IDLE;
                j4 j4Var2 = (j4) w0VarH3;
                cli.y yVar = j4Var2.f181140w0;
                if (((h0) ((vkm.j2) yVar.f22677a).getValue()).e.e != z) {
                    j4Var2.H2(yVar, new jck.y(z, 9));
                }
                break;
            case 2:
                mx0.b4 inputAction = (mx0.b4) obj2;
                MessagesScreen.a aVar3 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(inputAction, "inputAction");
                messagesScreen.p0 = true;
                ((j4) messagesScreen.h3()).m3(inputAction);
                break;
            case 3:
                od0.i voicePreview = (od0.i) obj2;
                MessagesScreen.a aVar4 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(voicePreview, "voicePreview");
                oo0.g gVar = (oo0.g) voicePreview.g();
                if (gVar != null) {
                    w0 w0VarH32 = messagesScreen.h3();
                    String absolutePath = gVar.f226977a.getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    long j2 = gVar.f226979c;
                    oo0.m mVar = gVar.f226978b;
                    long j3 = mVar.f226990a;
                    d70.c cVar = mVar.f226991b;
                    int i21 = cVar.f111733b;
                    byte[] bArr = new byte[i21];
                    byte[] bArr2 = cVar.f111732a;
                    for (int i22 = 0; i22 < i21; i22++) {
                        bArr[i22] = bArr2[i22];
                    }
                    Unit unit = Unit.f186387a;
                    x30.c recording = new x30.c(absolutePath, bArr, j2, j3);
                    j4 j4Var3 = (j4) w0VarH32;
                    j4Var3.getClass();
                    Intrinsics.checkNotNullParameter(recording, "recording");
                    j4Var3.H2(j4Var3.f181140w0, new k0d.c(recording, 23));
                } else {
                    j4 j4Var4 = (j4) messagesScreen.h3();
                    j4Var4.H2(j4Var4.f181140w0, new l2(0));
                }
                break;
            case 4:
                Instant date = (Instant) obj2;
                MessagesScreen.a aVar5 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(date, "date");
                j4 j4Var5 = (j4) messagesScreen.h3();
                j4Var5.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                cli.y yVar2 = j4Var5.f181140w0;
                List list = ((h0) ((vkm.j2) yVar2.f22677a).getValue()).d.f181178a;
                Object value = j4Var5.f181142x0.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                Instant instant = date.toDateTime((DateTimeZone) value).withTimeAtStartOfDay().toInstant();
                v20.n nVar = (v20.n) zhm.d0.d0(list);
                Continuation continuation2 = null;
                if (Intrinsics.f((nVar == null || (time = nVar.getTime()) == null) ? null : Boolean.valueOf(time.isBefore(instant)), Boolean.TRUE)) {
                    j4Var5.H2(yVar2, new i2(instant, z ? 1 : 0));
                } else {
                    v20.n nVar2 = (v20.n) zhm.d0.d0(list);
                    if (nVar2 != null) {
                        j4Var5.l2(new k0g.b(j4Var5, instant, nVar2, continuation2, 10), new yi5.b(26));
                    }
                }
                break;
            case 5:
                String query = (String) obj2;
                MessagesScreen.a aVar6 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(query, "query");
                j4 j4Var6 = (j4) messagesScreen.h3();
                j4Var6.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                vkm.j2 j2Var = j4Var6.f181127k0;
                s2 s2Var = new s2(kotlin.text.d0.F0(query).toString(), false);
                j2Var.getClass();
                j2Var.g(null, s2Var);
                break;
            case 6:
                String query2 = (String) obj2;
                MessagesScreen.a aVar7 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(query2, "query");
                j4 j4Var7 = (j4) messagesScreen.h3();
                j4Var7.getClass();
                Intrinsics.checkNotNullParameter(query2, "query");
                vkm.j2 j2Var2 = j4Var7.f181127k0;
                s2 s2Var2 = new s2(kotlin.text.d0.F0(query2).toString(), true);
                j2Var2.getClass();
                j2Var2.g(null, s2Var2);
                break;
            case 7:
                MessagesScreen.a aVar8 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                j4 j4Var8 = (j4) messagesScreen.h3();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                j4Var8.H2(j4Var8.f181140w0, new abf.n(i5, ref$ObjectRef, i2));
                f30.i iVar = (f30.i) ref$ObjectRef.f186409a;
                if (iVar != null) {
                    j4Var8.s3(iVar.f131870a, iVar.f131871b, iVar.f131872c);
                }
                break;
            case 8:
                MessagesScreen.a aVar9 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                j4 j4Var9 = (j4) messagesScreen.h3();
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                j4Var9.H2(j4Var9.f181140w0, new abf.n(i3, ref$ObjectRef2, i2));
                f30.i iVar2 = (f30.i) ref$ObjectRef2.f186409a;
                if (iVar2 != null) {
                    j4Var9.s3(iVar2.f131870a, iVar2.f131871b, iVar2.f131872c);
                }
                break;
            case 9:
                if (((Boolean) obj2).booleanValue()) {
                    messagesScreen.f51186n0 = 3;
                } else {
                    MessagesScreen.a aVar10 = MessagesScreen.Companion;
                }
                break;
            case 10:
                List items = (List) obj2;
                MessagesScreen.a aVar11 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(items, "items");
                if (messagesScreen.F.getState() != Lifecycle.State.DESTROYED) {
                    ((q50.o) messagesScreen.g3().E.get()).g3(items);
                }
                break;
            case 11:
                MessagesScreen.a aVar12 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                ((j4) messagesScreen.h3()).m3(mx0.b4.ATTACH_FILE);
                break;
            case 12:
                koi.j item = (koi.j) obj2;
                MessagesScreen.a aVar13 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(item, "item");
                v20.n nVarD3 = ((j4) messagesScreen.h3()).d3(item);
                if (nVarD3 != null) {
                }
                break;
            case 13:
                gw0.h attachment = (gw0.h) obj2;
                MessagesScreen.a aVar14 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(attachment, "it");
                j4 j4Var10 = (j4) messagesScreen.h3();
                j4Var10.getClass();
                Intrinsics.checkNotNullParameter(attachment, "attachment");
                Object objA = attachment.a();
                File file = objA instanceof File ? (File) objA : null;
                if (file != null) {
                    j4Var10.l2(new ji1.m(file, continuation, 27), new yi5.b(26));
                    j4Var10.H2(j4Var10.f181140w0, new b22.j(file, 3));
                }
                break;
            case 14:
                gw0.h attachment2 = (gw0.h) obj2;
                MessagesScreen.a aVar15 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(attachment2, "it");
                j4 j4Var11 = (j4) messagesScreen.h3();
                j4Var11.getClass();
                Intrinsics.checkNotNullParameter(attachment2, "attachment");
                Object objA2 = attachment2.a();
                File file2 = objA2 instanceof File ? (File) objA2 : null;
                if (file2 != null) {
                    String strD = o80.c.d(file2);
                    String str = strD == null ? "" : strD;
                    if (z50.k.d(str)) {
                        List list2 = ((h0) ((vkm.j2) j4Var11.f181140w0.f22677a).getValue()).e.f;
                        ArrayList<v20.u0> arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            String strD2 = o80.c.d(((v20.u0) obj3).f285576a);
                            if (strD2 == null) {
                                strD2 = "";
                            }
                            if (z50.k.d(strD2)) {
                                arrayList.add(obj3);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            Iterator it9 = arrayList.iterator();
                            int i32 = 0;
                            while (true) {
                                if (it9.hasNext()) {
                                    if (Intrinsics.f(((v20.u0) it9.next()).f285576a.getAbsolutePath(), file2.getAbsolutePath())) {
                                        i3 = i32;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                            Integer numValueOf = Integer.valueOf(i3);
                            if (i3 < 0) {
                                numValueOf = null;
                            }
                            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                            for (v20.u0 u0Var : arrayList) {
                                arrayList2.add(new rd7.f(u0Var.f285576a, u0Var.f285577b));
                            }
                            yji.l.j2(j4Var11, new ImageGalleryController(new rd7.j(arrayList2, Integer.valueOf(iIntValue), rd7.c.EDITABLE), null, new k2(j4Var11, i5), 2), null, null, 3);
                        }
                    } else {
                        j4Var11.F.d3(str, zhm.r0.g(), null, null, file2.getAbsolutePath());
                    }
                }
                break;
            case 15:
                MessagesScreen.a aVar16 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                j4 j4Var12 = (j4) messagesScreen.h3();
                j4Var12.H2(j4Var12.f181140w0, new l2(1));
                break;
            default:
                ty0.a data = (ty0.a) obj2;
                MessagesScreen.a aVar17 = MessagesScreen.Companion;
                Intrinsics.checkNotNullParameter(data, "it");
                j4 j4Var13 = (j4) messagesScreen.h3();
                j4Var13.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Object obj4 = data.d;
                if (obj4 instanceof ChaosManagementIncidentUiItem) {
                    j4Var13.f2(new OngoingOutageScreen(new r50.c(zhm.u.c(obj4))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new k1.a(j4Var13, obj4, 18));
                }
                break;
        }
        return Unit.f186387a;
    }
}
