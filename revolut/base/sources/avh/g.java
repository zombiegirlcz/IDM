package avh;

import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Avatar;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Dialog;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ScreenConfigurationDisplayItem;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ScreenConfigurationItem;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import evh.a;
import evh.g;
import evh.i;
import evh.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import org.jetbrains.annotations.NotNull;
import ril.j;
import yhm.m;
import yhm.o;
import yxc.l;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qil.b f10035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kvh.a f10036c;
    public final d d;

    public g(l iconMapper, qil.b frequencyMapper, kvh.a dataPointNameMapper, d screenFlowMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(frequencyMapper, "frequencyMapper");
        Intrinsics.checkNotNullParameter(dataPointNameMapper, "dataPointNameMapper");
        Intrinsics.checkNotNullParameter(screenFlowMapper, "screenFlowMapper");
        this.f10034a = iconMapper;
        this.f10035b = frequencyMapper;
        this.f10036c = dataPointNameMapper;
        this.d = screenFlowMapper;
    }

    public static WorkflowStepNavigation c(evh.h hVar) {
        Boolean skippable;
        Boolean backNavigation;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = (hVar == null || (backNavigation = hVar.getBackNavigation()) == null) ? false : backNavigation.booleanValue();
        if (hVar != null && (skippable = hVar.getSkippable()) != null) {
            zBooleanValue = skippable.booleanValue();
        }
        return new WorkflowStepNavigation(zBooleanValue2, zBooleanValue);
    }

    public final DataPoint a(evh.f fVar) {
        return new DataPoint(this.f10036c.a(fVar.getType()), null, fVar.getFormat(), new DataPoint.Configuration(fVar.getLegalEntityId(), fVar.getScopes(), fVar.getShowPurposesApplicableForTeens(), fVar.getShowPurposesApplicableForJoint()), fVar.getGroupCharacterLimit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public final WorkflowStepConfiguration b(evh.e eVar) {
        ril.f fVar;
        j jVar;
        ril.g gVar;
        ArrayList arrayList;
        ?? arrayList2;
        ril.g gVar2;
        String str;
        String str2;
        WorkflowScreenConfiguration workflowScreenConfiguration;
        ril.i iVar;
        String str3;
        String str4;
        ril.i iVar2;
        ArrayList arrayList3;
        ril.g gVar3;
        String str5;
        String str6;
        ArrayList arrayList4;
        Avatar avatar;
        Avatar base64;
        j jVar2;
        ril.f fVar2;
        String authenticationMethod = eVar.getAuthenticationMethod();
        if (authenticationMethod != null) {
            ril.f[] fVarArrValues = ril.f.values();
            int length = fVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    fVar2 = null;
                    break;
                }
                fVar2 = fVarArrValues[i];
                if (a0.z(fVar2.name(), authenticationMethod, true)) {
                    break;
                }
                i++;
            }
            if (fVar2 == null) {
                throw new UnrecognisedContractException("Unknown authenticationMethod ".concat(authenticationMethod));
            }
            fVar = fVar2;
        } else {
            fVar = null;
        }
        String signatureProcessType = eVar.getSignatureProcessType();
        if (signatureProcessType != null) {
            j[] jVarArrValues = j.values();
            int length2 = jVarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    jVar2 = null;
                    break;
                }
                jVar2 = jVarArrValues[i2];
                if (a0.z(jVar2.name(), signatureProcessType, true)) {
                    break;
                }
                i2++;
            }
            if (jVar2 == null) {
                throw new UnrecognisedContractException("Unknown signatureProcessType ".concat(signatureProcessType));
            }
            jVar = jVar2;
        } else {
            jVar = null;
        }
        String method = eVar.getMethod();
        if (method != null) {
            ril.g[] gVarArrValues = ril.g.values();
            int length3 = gVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i3];
                if (a0.z(gVar.name(), method, true)) {
                    break;
                }
                i3++;
            }
            if (gVar == null) {
                throw new UnrecognisedContractException("Unknown configuration method ".concat(method));
            }
        } else {
            gVar = null;
        }
        String applicableDocumentsScope = eVar.getApplicableDocumentsScope();
        List applicableCountries = eVar.getApplicableCountries();
        if (applicableCountries != null) {
            List list = applicableCountries;
            wi0.a aVar = wi0.b.Companion;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                kii.e.B(aVar, (String) it8.next(), arrayList);
            }
        } else {
            arrayList = null;
        }
        String formId = eVar.getFormId();
        ril.g gVar4 = gVar;
        Map formParams = eVar.getFormParams();
        List dataPoints = eVar.getDataPoints();
        if (dataPoints != null) {
            List list2 = dataPoints;
            arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(a((evh.f) it9.next()));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        k screenConfiguration = eVar.getScreenConfiguration();
        if (screenConfiguration != null) {
            String title = screenConfiguration.getTitle();
            String subtitle = screenConfiguration.getSubtitle();
            String asset = screenConfiguration.getAsset();
            List items = screenConfiguration.getItems();
            if (items != null) {
                List list3 = items;
                arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    evh.l lVar = (evh.l) it10.next();
                    String type = lVar.getType();
                    Iterator it11 = it10;
                    String title2 = lVar.getTitle();
                    List items2 = lVar.getItems();
                    if (items2 != null) {
                        List list4 = items2;
                        gVar3 = gVar4;
                        str5 = applicableDocumentsScope;
                        str6 = formId;
                        arrayList4 = new ArrayList(w.t(list4, 10));
                        Iterator it12 = list4.iterator();
                        while (it12.hasNext()) {
                            evh.j jVar3 = (evh.j) it12.next();
                            String type2 = jVar3.getType();
                            evh.a avatar2 = jVar3.getAvatar();
                            Iterator it13 = it12;
                            if (avatar2 != null) {
                                if (avatar2 instanceof a.b) {
                                    base64 = new Avatar.Initials(((a.b) avatar2).getValue());
                                } else {
                                    if (!(avatar2 instanceof a.C0757a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    base64 = new Avatar.Base64(((a.C0757a) avatar2).getValue());
                                }
                                avatar = base64;
                            } else {
                                avatar = null;
                            }
                            arrayList4.add(new ScreenConfigurationDisplayItem(type2, avatar, jVar3.getTitle(), jVar3.getSubtitle(), jVar3.getSide()));
                            it12 = it13;
                        }
                    } else {
                        gVar3 = gVar4;
                        str5 = applicableDocumentsScope;
                        str6 = formId;
                        arrayList4 = null;
                    }
                    arrayList3.add(new ScreenConfigurationItem(type, title2, arrayList4));
                    formId = str6;
                    it10 = it11;
                    gVar4 = gVar3;
                    applicableDocumentsScope = str5;
                }
            } else {
                arrayList3 = null;
            }
            gVar2 = gVar4;
            str = applicableDocumentsScope;
            str2 = formId;
            workflowScreenConfiguration = new WorkflowScreenConfiguration(title, subtitle, asset, arrayList3);
        } else {
            gVar2 = gVar4;
            str = applicableDocumentsScope;
            str2 = formId;
            workflowScreenConfiguration = null;
        }
        ArrayList arrayList5 = arrayList;
        ?? r92 = arrayList2;
        String onboardingStep = eVar.getOnboardingStep();
        String sdkVendor = eVar.getSdkVendor();
        if (sdkVendor != null) {
            ril.i[] iVarArrValues = ril.i.values();
            int length4 = iVarArrValues.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length4) {
                    iVar2 = null;
                    break;
                }
                iVar2 = iVarArrValues[i5];
                if (a0.z(iVar2.name(), sdkVendor, true)) {
                    break;
                }
                i5++;
            }
            if (iVar2 == null) {
                throw new UnrecognisedContractException("Unknown configuration sdk vendor: ".concat(sdkVendor));
            }
            iVar = iVar2;
        } else {
            iVar = null;
        }
        WorkflowStepConfiguration.Screen screenB = this.d.b(eVar.getScreenName(), eVar.getScreenFlowConfiguration());
        String supportDeeplink = eVar.getSupportDeeplink();
        Integer pollingInterval = eVar.getPollingInterval();
        String value = eVar.getIdentityId();
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            str3 = value;
        } else {
            str3 = null;
        }
        String value2 = eVar.getRegisteredIdentityId();
        if (value2 != null) {
            Intrinsics.checkNotNullParameter(value2, "value");
            str4 = value2;
        } else {
            str4 = null;
        }
        return new WorkflowStepConfiguration(gVar2, str, arrayList5, str2, formParams, r92, workflowScreenConfiguration, fVar, jVar, onboardingStep, iVar, screenB, supportDeeplink, pollingInterval, str3, str4);
    }

    public final Dialog d(evh.g gVar) {
        aal.b bVarA;
        String entryLabel = gVar.getEntryLabel();
        String title = gVar.getTitle();
        String description = gVar.getDescription();
        List items = gVar.getItems();
        if (items == null) {
            items = f0.f322471a;
        }
        List<g.a> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g.a aVar : list) {
            String icon = aVar.getIcon();
            if (icon == null || (bVarA = this.f10034a.a(icon)) == null) {
                bVarA = aal.b.INFO;
            }
            arrayList.add(new Dialog.Item(bVarA, aVar.getTitle(), aVar.getSubtitle()));
        }
        return new Dialog(entryLabel, title, description, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Map] */
    public final Question e(evh.i iVar) {
        Object objA;
        Long maxFileSizeInBytes;
        Integer minFilesCount;
        ?? arrayList;
        if (iVar instanceof i.d) {
            i.d dVar = (i.d) iVar;
            String id10 = dVar.getId();
            String title = dVar.getTitle();
            String subtitle = dVar.getSubtitle();
            List<i.f> options = dVar.getOptions();
            ArrayList arrayList2 = new ArrayList(w.t(options, 10));
            for (i.f fVar : options) {
                arrayList2.add(new Question.Choice.Option(fVar.getId(), fVar.getTitle(), fVar.getSubtitle()));
            }
            evh.g hiddenDialog = dVar.getHiddenDialog();
            return new Question.Choice.MultiChoice(hiddenDialog != null ? d(hiddenDialog) : null, id10, title, subtitle, arrayList2);
        }
        if (iVar instanceof i.g) {
            i.g gVar = (i.g) iVar;
            String id11 = gVar.getId();
            String title2 = gVar.getTitle();
            String subtitle2 = gVar.getSubtitle();
            List<i.f> options2 = gVar.getOptions();
            ArrayList arrayList3 = new ArrayList(w.t(options2, 10));
            for (i.f fVar2 : options2) {
                arrayList3.add(new Question.Choice.Option(fVar2.getId(), fVar2.getTitle(), fVar2.getSubtitle()));
            }
            evh.g hiddenDialog2 = gVar.getHiddenDialog();
            return new Question.Choice.SingleChoice(hiddenDialog2 != null ? d(hiddenDialog2) : null, id11, title2, subtitle2, arrayList3);
        }
        if (iVar instanceof i.h) {
            i.h hVar = (i.h) iVar;
            String id12 = hVar.getId();
            String title3 = hVar.getTitle();
            String subtitle3 = hVar.getSubtitle();
            String placeholder = hVar.getPlaceholder();
            String assistiveText = hVar.getAssistiveText();
            Integer maxLength = hVar.getMaxLength();
            evh.g hiddenDialog3 = hVar.getHiddenDialog();
            return new Question.Text(id12, title3, subtitle3, hiddenDialog3 != null ? d(hiddenDialog3) : null, placeholder, assistiveText, maxLength);
        }
        if (iVar instanceof i.e) {
            i.e eVar = (i.e) iVar;
            String id13 = eVar.getId();
            String title4 = eVar.getTitle();
            String subtitle4 = eVar.getSubtitle();
            evh.g hiddenDialog4 = eVar.getHiddenDialog();
            Dialog dialogD = hiddenDialog4 != null ? d(hiddenDialog4) : null;
            List<i.e.a> items = eVar.getItems();
            ArrayList arrayList4 = new ArrayList(w.t(items, 10));
            for (i.e.a aVar : items) {
                arrayList4.add(new Question.MultiText.Item(aVar.getMaxLength(), aVar.getId(), aVar.getPlaceholder(), aVar.getAssistiveText()));
            }
            return new Question.MultiText(dialogD, id13, title4, subtitle4, arrayList4);
        }
        if (iVar instanceof i.k) {
            i.k kVar = (i.k) iVar;
            String id14 = kVar.getId();
            String title5 = kVar.getTitle();
            String subtitle5 = kVar.getSubtitle();
            String yesTitle = kVar.getYesTitle();
            String noTitle = kVar.getNoTitle();
            evh.g hiddenDialog5 = kVar.getHiddenDialog();
            return new Question.YesNo(id14, title5, subtitle5, hiddenDialog5 != null ? d(hiddenDialog5) : null, yesTitle, noTitle);
        }
        if (iVar instanceof i.c) {
            i.c cVar = (i.c) iVar;
            String id15 = cVar.getId();
            String title6 = cVar.getTitle();
            String subtitle6 = cVar.getSubtitle();
            List frequencies = cVar.getFrequencies();
            if (frequencies != null) {
                List<String> list = frequencies;
                arrayList = new ArrayList(w.t(list, 10));
                for (String value : list) {
                    ((kvh.d) this.f10035b).getClass();
                    Intrinsics.checkNotNullParameter(value, "value");
                    arrayList.add((sil.c) u1.u(value, kvh.d.f190123a));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = f0.f322471a;
            }
            ?? r102 = arrayList;
            evh.g hiddenDialog6 = cVar.getHiddenDialog();
            return new Question.Income(id15, title6, subtitle6, hiddenDialog6 != null ? d(hiddenDialog6) : null, r102);
        }
        if (iVar instanceof i.b) {
            i.b bVar = (i.b) iVar;
            String id16 = bVar.getId();
            String title7 = bVar.getTitle();
            String subtitle7 = bVar.getSubtitle();
            i.b.a structure = bVar.getStructure();
            int iIntValue = (structure == null || (minFilesCount = structure.getMinFilesCount()) == null) ? 1 : minFilesCount.intValue();
            i.b.a structure2 = bVar.getStructure();
            Integer maxFilesCount = structure2 != null ? structure2.getMaxFilesCount() : null;
            i.b.a structure3 = bVar.getStructure();
            long jLongValue = (structure3 == null || (maxFileSizeInBytes = structure3.getMaxFileSizeInBytes()) == null) ? 20971520L : maxFileSizeInBytes.longValue();
            evh.g hiddenDialog7 = bVar.getHiddenDialog();
            return new Question.Documents(id16, title7, subtitle7, hiddenDialog7 != null ? d(hiddenDialog7) : null, iIntValue, maxFilesCount, jLongValue);
        }
        if (iVar instanceof i.a) {
            i.a aVar2 = (i.a) iVar;
            String id17 = aVar2.getId();
            String title8 = aVar2.getTitle();
            String subtitle8 = aVar2.getSubtitle();
            evh.g hiddenDialog8 = aVar2.getHiddenDialog();
            return new Question.City(id17, title8, subtitle8, hiddenDialog8 != null ? d(hiddenDialog8) : null);
        }
        if (!(iVar instanceof i.C0758i)) {
            if (!(iVar instanceof i.j)) {
                throw new NoWhenBranchMatchedException();
            }
            i.j jVar = (i.j) iVar;
            throw new UnrecognisedContractException(j6.a.s("Unsupported question type UnknownDto(id=", jVar.getId(), ", title=", jVar.getTitle(), ")"));
        }
        i.C0758i c0758i = (i.C0758i) iVar;
        String id18 = c0758i.getId();
        String title9 = c0758i.getTitle();
        String subtitle9 = c0758i.getSubtitle();
        evh.g hiddenDialog9 = c0758i.getHiddenDialog();
        Dialog dialogD2 = hiddenDialog9 != null ? d(hiddenDialog9) : null;
        i.C0758i.a item = c0758i.getItem();
        String valuePlaceholder = item.getValuePlaceholder();
        String startDatePlaceholder = item.getStartDatePlaceholder();
        String endDatePlaceholder = item.getEndDatePlaceholder();
        try {
            m.Companion companion = m.INSTANCE;
            objA = com.revolut.shared.feature.workflow.engine.api.models.workflow.a.valueOf(item.getDateRangePrecision());
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (m.a(objA) == null) {
            return new Question.Timeline(id18, title9, subtitle9, dialogD2, new Question.Timeline.Item(valuePlaceholder, startDatePlaceholder, endDatePlaceholder, (com.revolut.shared.feature.workflow.engine.api.models.workflow.a) objA, item.getMinDate(), item.getMaxDate()), c0758i.getNewItemLabel(), c0758i.getMaxItems(), c0758i.getItemLabels());
        }
        throw new UnrecognisedContractException(com.google.android.gms.internal.mlkit_vision_face.a.o(item.getDateRangePrecision(), " can't be deserialized as ", com.revolut.shared.feature.workflow.engine.api.models.workflow.a.class.getSimpleName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow f(evh.d0 r23) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: avh.g.f(evh.d0):com.revolut.shared.feature.workflow.engine.api.models.workflow.Workflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c6  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowV2 g(evh.e0 r20) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: avh.g.g(evh.e0):com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowV2");
    }
}
