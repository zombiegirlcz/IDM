package gc0;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.util.TypedValue;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.app.NotificationCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import aw0.cb;
import b9.w2;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.models.bizum.BizumTransferInfo;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.checkout.models.PreorderPreconditions;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.core.navigation.pendingintent.PendingIntentFeatureNavigationActivity;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import dej.i0;
import dej.o0;
import f2e.o2;
import f2e.p2;
import f2e.q3;
import f2e.s2;
import ht0.c0;
import ipa.o;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import js1.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.text.a0;
import l8a.j;
import le.u1;
import nd.m;
import nd.n;
import pi3.q;
import soh.i;
import t1e.x;
import zhm.a1;
import zhm.f0;
import zhm.w;
import zsc.p;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c {
    public static final LinkedHashSet A(Set set, Object obj2) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return set.contains(obj2) ? a1.j(set, obj2) : a1.m(set, obj2);
    }

    public static zzsb B(int i) {
        switch (i) {
            case 1:
                return zzsb.LATIN;
            case 2:
                return zzsb.LATIN_AND_CHINESE;
            case 3:
                return zzsb.LATIN_AND_DEVANAGARI;
            case 4:
                return zzsb.LATIN_AND_JAPANESE;
            case 5:
                return zzsb.LATIN_AND_KOREAN;
            case 6:
                return zzsb.CREDIT_CARD;
            case 7:
                return zzsb.DOCUMENT;
            case 8:
                return zzsb.PIXEL_AI;
            default:
                return zzsb.TYPE_UNKNOWN;
        }
    }

    public static boolean C(ClassLoader classLoader, File file, File file2, boolean z, m mVar, String str, n nVar) {
        ArrayList arrayList = new ArrayList();
        Field fieldL = hb9.b.L(classLoader, "pathList");
        try {
            Object objCast = Object.class.cast(fieldL.get(classLoader));
            wc.f fVarI = hb9.b.I("dexElements", Object.class, objCast);
            List listAsList = Arrays.asList((Object[]) fVarI.n());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listAsList) {
                Field fieldL2 = hb9.b.L(obj2, str);
                try {
                    arrayList2.add((File) File.class.cast(fieldL2.get(obj2)));
                } catch (Exception e) {
                    String name = fieldL2.getName();
                    String name2 = obj2.getClass().getName();
                    String name3 = File.class.getName();
                    StringBuilder sbM = v0.a.m("Failed to get value of field ", name, " of type ", name2, " on object of type ");
                    sbM.append(name3);
                    throw new zzbl(sbM.toString(), e);
                }
            }
            if (arrayList2.contains(file2)) {
                return true;
            }
            if (!z) {
                nVar.getClass();
            }
            ArrayList arrayList3 = new ArrayList(Collections.singleton(file2));
            mVar.getClass();
            try {
                fVarI.p(Arrays.asList((Object[]) Object[].class.cast(hb9.b.M(objCast.getClass(), "makePathElements", List.class, File.class, List.class).invoke(objCast, arrayList3, file, arrayList))));
                if (arrayList.isEmpty()) {
                    return true;
                }
                zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i));
                    } catch (Exception unused) {
                    }
                }
                hb9.b.I("dexElementsSuppressedExceptions", IOException.class, objCast).p(arrayList);
                throw zzbhVar;
            } catch (Exception e2) {
                throw new zzbl("Failed to invoke method makePathElements on an object of type " + objCast.getClass(), e2);
            }
        } catch (Exception e4) {
            String name4 = fieldL.getName();
            String name5 = classLoader.getClass().getName();
            String name6 = Object.class.getName();
            StringBuilder sbM2 = v0.a.m("Failed to get value of field ", name4, " of type ", name5, " on object of type ");
            sbM2.append(name6);
            throw new zzbl(sbM2.toString(), e4);
        }
    }

    public static final WrapperFlowImpl a(BaseFlow controller, qii.a resultHandler) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        return new WrapperFlowImpl(controller, resultHandler);
    }

    public static final WrapperFlowImpl b(ViewController controller, qii.a resultHandler) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        return new WrapperFlowImpl(controller, resultHandler);
    }

    public static final String c(j jVar) {
        jo3.a aVarB = jVar.getAmount();
        Long lValueOf = aVarB != null ? Long.valueOf(aVarB.getAmount()) : null;
        jo3.a aVarB2 = jVar.getAmount();
        return v0.a.i(v0.a.m("GenerateQrCodeRequestDto(", "amountValue=" + lValueOf + ", amountCurrency=" + (aVarB2 != null ? aVarB2.getCurrency() : null), ", message=", jVar.getMessage(), ", "), "aliasType=" + jVar.getAlias().getType() + ", aliasValue=" + jVar.getAlias().getValue(), ")");
    }

    public static final String d(Method method) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb6.append(kotlin.collections.d.d0(parameterTypes, "", "(", ")", zim.c.o, 24));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb6.append(ReflectClassUtilKt.getDesc(returnType));
        return sb6.toString();
    }

    public static final void e(Logger logger, xlm.a aVar, xlm.b bVar, String str) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(bVar.f307056b);
        sb6.append(p.SPACE_CHAR);
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        sb6.append(str2);
        sb6.append(": ");
        sb6.append(aVar.f307052a);
        logger.fine(sb6.toString());
    }

    public static final FeatureCommand f(FeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "<this>");
        return new FeatureCommand(featureConfig);
    }

    public static final int g(i iVar, BigDecimal step) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(step, "step");
        return iVar.f264839a.divide(step).intValue();
    }

    public static int h(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final String i(long j2) {
        String strJ;
        if (j2 <= -999500000) {
            strJ = a0.d.j((j2 - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j2 <= -999500) {
            strJ = a0.d.j((j2 - ((long) LivenessConstants.OUT_OF_STORAGE_THRESHOLD_BYTES)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j2 <= 0) {
            strJ = a0.d.j((j2 - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j2 < 999500) {
            strJ = a0.d.j((j2 + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j2 < 999500000) {
            strJ = a0.d.j((j2 + ((long) LivenessConstants.OUT_OF_STORAGE_THRESHOLD_BYTES)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strJ = a0.d.j((j2 + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return a0.d.v(new Object[]{strJ}, 1, "%6s", "format(...)");
    }

    public static final Intent j(MainScreenFeatureConfig mainScreenFeatureConfig, Context context) {
        Intrinsics.checkNotNullParameter(mainScreenFeatureConfig, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(context, (Class<?>) PendingIntentFeatureNavigationActivity.class);
        intent.putExtra("ARG_FEATURE_CONFIG", mainScreenFeatureConfig);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final e3g.a k(h3g.a aVar) {
        List list;
        List list2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = aVar.f149114a;
        TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer.f92761a;
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        if (travelExperienceBookingQuestion.f92790c == myf.f.NUMBER && (list2 = travelExperienceBookingQuestion.d) != null) {
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    myf.d dVar = ((TravelExperienceBookingQuestion.AnswerUnit) it8.next()).f92794a;
                    if (dVar == myf.d.KG || dVar == myf.d.LB) {
                        return e3g.a.WEIGHT;
                    }
                }
            }
        }
        TravelExperienceBookingQuestion travelExperienceBookingQuestion2 = travelExperiencesBookingQuestionAnswer.f92761a;
        TravelExperienceBookingQuestion travelExperienceBookingQuestion3 = travelExperiencesBookingQuestionAnswer.f92761a;
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion2, "<this>");
        if (travelExperienceBookingQuestion2.f92790c == myf.f.NUMBER && (list = travelExperienceBookingQuestion2.d) != null) {
            List list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    myf.d dVar2 = ((TravelExperienceBookingQuestion.AnswerUnit) it9.next()).f92794a;
                    if (dVar2 == myf.d.CM || dVar2 == myf.d.FT) {
                        return e3g.a.HEIGHT;
                    }
                }
            }
        }
        if (com.revolut.feature.travel.experiences.api.models.experience.a.b(travelExperienceBookingQuestion3)) {
            return e3g.a.ENUM;
        }
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion3, "<this>");
        if (travelExperienceBookingQuestion3.f92790c == myf.f.TIME) {
            return e3g.a.TIME;
        }
        return null;
    }

    public static final String l(TeenProfile teenProfile) {
        Intrinsics.checkNotNullParameter(teenProfile, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(teenProfile.f90335b, " ", teenProfile.f90336c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(lg0.b r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof p9d.a
            if (r0 == 0) goto L13
            r0 = r9
            p9d.a r0 = (p9d.a) r0
            int r1 = r0.f234294x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234294x = r1
            goto L18
        L13:
            p9d.a r0 = new p9d.a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f234293w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234294x
            java.lang.String r3 = "Can't handle link: "
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L2e
            java.lang.String r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r9)
            if (r7 == 0) goto L6e
            boolean r9 = kotlin.text.d0.W(r7)
            if (r9 == 0) goto L42
            goto L6e
        L42:
            oqk.i r9 = new oqk.i
            r2 = 11
            r9.<init>(r6, r7, r4, r2)
            r0.u = r7
            r0.v = r8
            r0.f234294x = r5
            java.lang.Object r9 = skm.e0.o(r9, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            if (r6 != 0) goto L6b
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            java.lang.String r7 = j6.a.q(r3, r7)
            rd0.d.a(r9, r8, r7, r4, r6)
        L6b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6e:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            java.lang.String r7 = j6.a.q(r3, r7)
            rd0.d.a(r9, r8, r7, r4, r6)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.c.m(lg0.b, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean n(EsimProfileEntry esimProfileEntry, dm0.b deviceId) {
        Intrinsics.checkNotNullParameter(esimProfileEntry, "<this>");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return a0.z(esimProfileEntry.f100442c, deviceId.f115814c, true) || a0.z(esimProfileEntry.d, deviceId.d, true);
    }

    public static final boolean o(EsimProfileEntry esimProfileEntry, List list) {
        String str;
        Intrinsics.checkNotNullParameter(esimProfileEntry, "<this>");
        if (list == null) {
            list = f0.f322471a;
        }
        List<o0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (o0 o0Var : list2) {
            if (o0Var instanceof i0) {
                EsimProfileDetails esimProfileDetails = ((i0) o0Var).f113555a.f100426g;
                if (pd.b.j((esimProfileDetails == null || (str = esimProfileDetails.f100433a) == null) ? null : Boolean.valueOf(str.equalsIgnoreCase(esimProfileEntry.e)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Notification p(ipa.g message, b90.i mapper) {
        ShortcutInfoCompat shortcutInfoCompatBuild;
        Intrinsics.checkNotNullParameter(message, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ContextThemeWrapper contextThemeWrapper = mapper.f13532a;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message instanceof ipa.b) {
            ipa.b bVar = (ipa.b) message;
            String str = bVar.i;
            NotificationCompat.Builder builder = new NotificationCompat.Builder(contextThemeWrapper, bVar.d.f167699a).setSmallIcon(bVar.f167688j).setContentTitle(bVar.f167687h).setContentText(str).setAutoCancel(bVar.f).setPriority(b90.i.a(bVar.f167698g)).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(b90.i.b(bVar.e));
            for (Pair pair : bVar.k) {
                builder.addAction(0, (String) pair.f186385a, b90.i.b((ipa.e) pair.f186386b));
            }
            Intrinsics.checkNotNullExpressionValue(builder, "apply(...)");
            Intrinsics.checkNotNullParameter(builder, "builder");
            NotificationCompat.BigTextStyle bigTextStyleBigText = new NotificationCompat.BigTextStyle(builder).bigText(str);
            Intrinsics.checkNotNullExpressionValue(bigTextStyleBigText, "bigText(...)");
            Notification notificationBuild = bigTextStyleBigText.build();
            if (notificationBuild != null) {
                return notificationBuild;
            }
            throw new IllegalStateException("Style Builder is not set for notification");
        }
        if (message instanceof ipa.c) {
            ipa.c cVar = (ipa.c) message;
            Notification notificationBuild2 = new NotificationCompat.Builder(contextThemeWrapper, cVar.d.f167699a).setSmallIcon(cVar.f167689h).setGroup(cVar.i).setGroupSummary(true).setContentText(cVar.f167690j).setAutoCancel(cVar.f).setPriority(b90.i.a(cVar.f167698g)).build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild2, "build(...)");
            return notificationBuild2;
        }
        if (!(message instanceof o)) {
            throw new IllegalStateException("Unknown push message type");
        }
        o oVar = (o) message;
        NotificationCompat.Builder group = new NotificationCompat.Builder(contextThemeWrapper, oVar.d.f167699a).setSmallIcon(oVar.i).setAutoCancel(oVar.f).setPriority(b90.i.a(oVar.f167698g)).setGroup(oVar.f167711j);
        w2 w2Var = oVar.k;
        ShortcutInfoCompat shortcutInfoCompat = null;
        if (w2Var != null) {
            ipa.n nVar = (ipa.n) w2Var.f13500c;
            ShortcutInfoCompat.Builder builder2 = new ShortcutInfoCompat.Builder(contextThemeWrapper, (String) w2Var.f13499b);
            int i = b90.h.f13531b[((ipa.a) w2Var.f13501g).ordinal()];
            if (i == 1) {
                builder2.setIsConversation();
            } else if (i == 2) {
                builder2.setIsConversation();
                builder2.setPerson(b90.i.c(nVar));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                builder2.setPerson(b90.i.c(nVar));
            }
            Bitmap bitmap = (Bitmap) w2Var.e;
            if (bitmap != null) {
                builder2.setIcon(IconCompat.createWithBitmap(bitmap));
            }
            builder2.setShortLabel((String) w2Var.d);
            builder2.setIntent((Intent) w2Var.f);
            shortcutInfoCompatBuild = builder2.build();
        } else {
            shortcutInfoCompatBuild = null;
        }
        if (shortcutInfoCompatBuild != null) {
            ShortcutManagerCompat.pushDynamicShortcut(contextThemeWrapper, shortcutInfoCompatBuild);
            shortcutInfoCompat = shortcutInfoCompatBuild;
        }
        NotificationCompat.Builder contentIntent = group.setShortcutInfo(shortcutInfoCompat).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(b90.i.b(oVar.e));
        ipa.m mVar = oVar.f167710h;
        if (mVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(b90.i.c(mVar.f167704a));
        messagingStyle.setConversationTitle(mVar.f167705b);
        messagingStyle.setGroupConversation(mVar.d);
        for (ipa.d dVar : mVar.f167706c) {
            messagingStyle.addMessage(dVar.f167692b, 0L, b90.i.c(dVar.f167691a));
        }
        Notification notificationBuild3 = contentIntent.setStyle(messagingStyle).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild3, "build(...)");
        return notificationBuild3;
    }

    public static final boolean q(h93.f0 f0Var, h93.f0 other) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return (f0Var.d && other.d) ? f0Var.H == other.H && f0Var.G == other.G : Intrinsics.f(f0Var.f150110a, other.f150110a);
    }

    public static final c0 r(cb cbVar, Context context) {
        Intrinsics.checkNotNullParameter(cbVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.s(cbVar.f10269a, context);
        int iS2 = kli.a.s(cbVar.f10270b, context);
        int iS3 = kli.a.s(cbVar.f10271c, context);
        boolean z = cbVar.d;
        return new c0(iS, iS2, iS3, z ? Integer.valueOf(io0.a.b(0.2f, iS)) : null, z ? Integer.valueOf(kli.a.s(R$attr.uikit_colorTransparent, context)) : null);
    }

    public static final BizumTransferInfo s(l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        jy1.c cVarA = jy1.b.a(lVar.getBizumContact());
        if (cVarA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String strF = lVar.getId();
        BizumContact bizumContactB = mx1.e.b(cVarA, null);
        dj0.d dVarO = mo3.a.o(lVar.getAmount());
        String strC = lVar.getComment();
        if (strC == null) {
            strC = "";
        }
        return new BizumTransferInfo(strF, bizumContactB, dVarO, strC, lVar.getEdt(), mo3.a.o(lVar.getFee()));
    }

    public static final MultibancoWithdrawalCode t(c72.a aVar) {
        h02.f fVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f21830a;
        String str2 = aVar.f21832c;
        c72.c cVar = aVar.f21831b;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = c72.b.f21836a[cVar.ordinal()];
        if (i == 1) {
            fVar = h02.f.ACTIVE;
        } else if (i == 2) {
            fVar = h02.f.USED;
        } else if (i == 3) {
            fVar = h02.f.EXPIRED;
        } else if (i == 4) {
            fVar = h02.f.CANCELLED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = h02.f.UNKNOWN;
        }
        return new MultibancoWithdrawalCode(str, str2, fVar, aVar.d, aVar.e, hx7.a.v(aVar.f), z92.f.K(aVar.f21833g), z92.f.K(aVar.f21834h), z92.f.K(aVar.i), aVar.f21835j);
    }

    public static final StoreMegaFiltersResponse u(s2 s2Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        List<p2> list = s2Var.f131712a;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (p2 p2Var : list) {
            Intrinsics.checkNotNullParameter(p2Var, "<this>");
            String str = p2Var.f131690a;
            String str2 = p2Var.f131691b;
            List<o2> list2 = p2Var.f131692c;
            ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
            for (o2 o2Var : list2) {
                Intrinsics.checkNotNullParameter(o2Var, "<this>");
                String str3 = o2Var.f131678a;
                String str4 = o2Var.f131679b;
                t1e.w wVar = x.Companion;
                String str5 = o2Var.f131680c;
                wVar.getClass();
                arrayList3.add(new StoreMegaFilter.StoreMegaFilterValue(str3, str4, t1e.w.a(str5)));
            }
            arrayList2.add(new StoreMegaFilter(str, str2, arrayList3));
        }
        List list3 = s2Var.f131713b;
        if (list3 != null) {
            List<q3> list4 = list3;
            arrayList = new ArrayList(w.t(list4, 10));
            for (q3 q3Var : list4) {
                Intrinsics.checkNotNullParameter(q3Var, "<this>");
                String str6 = q3Var.f131695a;
                String str7 = q3Var.f131696b;
                t1e.w wVar2 = x.Companion;
                String str8 = q3Var.f131697c;
                wVar2.getClass();
                arrayList.add(new StoreMegaQuickFilter(str6, str7, t1e.w.a(str8)));
            }
        } else {
            arrayList = null;
        }
        return new StoreMegaFiltersResponse(arrayList2, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final pi3.l v(mi3.c r17) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.c.v(mi3.c):pi3.l");
    }

    public static final c72.a w(MultibancoWithdrawalCode multibancoWithdrawalCode) {
        c72.c cVar;
        Intrinsics.checkNotNullParameter(multibancoWithdrawalCode, "<this>");
        String str = multibancoWithdrawalCode.f61951a;
        String str2 = multibancoWithdrawalCode.f61952b;
        h02.f fVar = multibancoWithdrawalCode.f61953c;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i = c72.b.f21837b[fVar.ordinal()];
        if (i == 1) {
            cVar = c72.c.ACTIVE;
        } else if (i == 2) {
            cVar = c72.c.USED;
        } else if (i == 3) {
            cVar = c72.c.EXPIRED;
        } else if (i == 4) {
            cVar = c72.c.CANCELLED;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = c72.c.UNKNOWN;
        }
        return new c72.a(str, cVar, str2, multibancoWithdrawalCode.d, multibancoWithdrawalCode.e, hx7.a.A(multibancoWithdrawalCode.f), oi0.d.R(multibancoWithdrawalCode.f61954g), oi0.d.R(multibancoWithdrawalCode.f61955h), oi0.d.R(multibancoWithdrawalCode.i), multibancoWithdrawalCode.f61956j);
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final mi3.c x(pi3.l lVar) {
        mi3.b bVar;
        mi3.d dVar;
        mi3.f fVar;
        mi3.d dVar2;
        String strName;
        String strName2;
        String strName3;
        String strName4;
        mi3.a aVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str = lVar.f236409a;
        String strG = u1.g(lVar.f236410b, fi3.a.f135288a);
        pi3.n nVar = lVar.f236411c;
        mi3.e eVar = null;
        if (nVar != null) {
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            String str2 = nVar.f236412a;
            pi3.i iVar = nVar.f236413b;
            if (iVar != null) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                aVar = new mi3.a(hx7.a.A(iVar.f236407a), hx7.a.A(iVar.f236408b));
            } else {
                aVar = null;
            }
            bVar = new mi3.b(str2, aVar);
        } else {
            bVar = null;
        }
        pi3.p pVar = lVar.d;
        if (pVar != null) {
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            String str3 = pVar.f236414a;
            hha.i iVar2 = pVar.f236415b;
            dVar = new mi3.d(str3, iVar2 != null ? u1.g(iVar2, fi3.a.f135289b) : null, pVar.f236416c);
        } else {
            dVar = null;
        }
        Instant instant = lVar.e;
        Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
        PreorderPreconditions preorderPreconditions = lVar.f;
        if (preorderPreconditions != null) {
            Intrinsics.checkNotNullParameter(preorderPreconditions, "<this>");
            q qVar = preorderPreconditions.d;
            mi3.e eVar2 = (qVar == null || (strName4 = qVar.name()) == null) ? null : new mi3.e(strName4);
            pi3.o oVar = preorderPreconditions.f65878a;
            mi3.e eVar3 = (oVar == null || (strName3 = oVar.name()) == null) ? null : new mi3.e(strName3);
            pi3.j jVar = preorderPreconditions.f65880c;
            mi3.e eVar4 = (jVar == null || (strName2 = jVar.name()) == null) ? null : new mi3.e(strName2);
            pi3.m mVar = preorderPreconditions.f65879b;
            if (mVar != null && (strName = mVar.name()) != null) {
                eVar = new mi3.e(strName);
            }
            mi3.f fVar2 = new mi3.f(eVar2, eVar3, eVar, eVar4);
            dVar2 = dVar;
            fVar = fVar2;
        } else {
            mi3.d dVar3 = dVar;
            fVar = null;
            dVar2 = dVar3;
        }
        return new mi3.c(str, strG, bVar, dVar2, lValueOf, fVar);
    }

    public static final void y(gs3.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = lz4.b.f200937a[aVar.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Credit card forbearance flow has been removed");
        }
        if (i != 2) {
            if (i == 3) {
                throw new IllegalStateException("Pay later forbearance flow has been removed");
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final String z(xzg.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = o7h.m.f222822a[oVar.ordinal()];
        if (i == 1) {
            return "STOCK";
        }
        if (i == 2) {
            return "CRYPTO";
        }
        throw new NoWhenBranchMatchedException();
    }
}
