package com.revolut.data.network.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import ro3.a;
import ro3.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001:\u0003JKLB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001aJ´\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001dR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010!R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b?\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010$R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\bE\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bG\u0010*R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\bH\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bI\u0010\u001a¨\u0006M"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto;", "", "", "id", "name", "Lro3/a;", "logo", "", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$BranchDto;", "branches", "", "paymentInitiation", "infoProvider", "Lro3/j;", "topupSettings", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$Requirement;", "requirements", "mandateInitiation", "nameSharingOnPaymentSupported", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;", "health", "tags", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lro3/a;Ljava/util/List;ZZLro3/j;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lro3/a;", "component4", "()Ljava/util/List;", "component5", "()Z", "component6", "component7", "()Lro3/j;", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "component11", "()Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Lro3/a;Ljava/util/List;ZZLro3/j;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;Ljava/util/List;Ljava/lang/String;)Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "Ljava/lang/String;", "getId", "getName", "Lro3/a;", "getLogo", "Ljava/util/List;", "getBranches", "Z", "getPaymentInitiation", "getInfoProvider", "Lro3/j;", "getTopupSettings", "getRequirements", "Ljava/lang/Boolean;", "getMandateInitiation", "getNameSharingOnPaymentSupported", "Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;", "getHealth", "getTags", "getDescription", "BranchDto", "Requirement", "HealthDto", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExternalInstitutionDto {

    @b("branches")
    private final List<BranchDto> branches;

    @b("description")
    private final String description;

    @b("health")
    private final HealthDto health;

    @b("id")
    @NotNull
    private final String id;

    @b("infoProvider")
    private final boolean infoProvider;

    @b("logo")
    @NotNull
    private final a logo;

    @b("mandateInitiation")
    private final Boolean mandateInitiation;

    @b("name")
    @NotNull
    private final String name;

    @b("nameSharingOnPaymentSupported")
    private final Boolean nameSharingOnPaymentSupported;

    @b("paymentInitiation")
    private final boolean paymentInitiation;

    @b("requirements")
    private final List<Requirement> requirements;

    @b("tags")
    private final List<String> tags;

    @b("topupSettings")
    private final j topupSettings;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$BranchDto;", "", "id", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BranchDto {

        @b("id")
        @NotNull
        private final String id;

        @b("name")
        @NotNull
        private final String name;

        public BranchDto(@NotNull String id10, @NotNull String name) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id10;
            this.name = name;
        }

        public static /* synthetic */ BranchDto copy$default(BranchDto branchDto, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = branchDto.id;
            }
            if ((i & 2) != 0) {
                str2 = branchDto.name;
            }
            return branchDto.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final BranchDto copy(@NotNull String id10, @NotNull String name) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            return new BranchDto(id10, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BranchDto)) {
                return false;
            }
            BranchDto branchDto = (BranchDto) other;
            return Intrinsics.f(this.id, branchDto.id) && Intrinsics.f(this.name, branchDto.name);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$HealthDto;", "", "general", "", "<init>", "(Ljava/lang/String;)V", "getGeneral", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HealthDto {

        @b("general")
        @NotNull
        private final String general;

        public HealthDto(@NotNull String general) {
            Intrinsics.checkNotNullParameter(general, "general");
            this.general = general;
        }

        public static /* synthetic */ HealthDto copy$default(HealthDto healthDto, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = healthDto.general;
            }
            return healthDto.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getGeneral() {
            return this.general;
        }

        @NotNull
        public final HealthDto copy(@NotNull String general) {
            Intrinsics.checkNotNullParameter(general, "general");
            return new HealthDto(general);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HealthDto) && Intrinsics.f(this.general, ((HealthDto) other).general);
        }

        @NotNull
        public final String getGeneral() {
            return this.general;
        }

        public int hashCode() {
            return this.general.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/revolut/data/network/models/openbanking/ExternalInstitutionDto$Requirement;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Requirement {

        @b("value")
        @NotNull
        private final String value;

        public Requirement(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Requirement copy$default(Requirement requirement, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = requirement.value;
            }
            return requirement.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Requirement copy(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Requirement(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Requirement) && Intrinsics.f(this.value, ((Requirement) other).value);
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }
    }

    public ExternalInstitutionDto(@NotNull String id10, @NotNull String name, @NotNull a logo, List<BranchDto> list, boolean z, boolean z3, j jVar, List<Requirement> list2, Boolean bool, Boolean bool2, HealthDto healthDto, List<String> list3, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.id = id10;
        this.name = name;
        this.logo = logo;
        this.branches = list;
        this.paymentInitiation = z;
        this.infoProvider = z3;
        this.topupSettings = jVar;
        this.requirements = list2;
        this.mandateInitiation = bool;
        this.nameSharingOnPaymentSupported = bool2;
        this.health = healthDto;
        this.tags = list3;
        this.description = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExternalInstitutionDto copy$default(ExternalInstitutionDto externalInstitutionDto, String str, String str2, a aVar, List list, boolean z, boolean z3, j jVar, List list2, Boolean bool, Boolean bool2, HealthDto healthDto, List list3, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = externalInstitutionDto.id;
        }
        return externalInstitutionDto.copy(str, (i & 2) != 0 ? externalInstitutionDto.name : str2, (i & 4) != 0 ? externalInstitutionDto.logo : aVar, (i & 8) != 0 ? externalInstitutionDto.branches : list, (i & 16) != 0 ? externalInstitutionDto.paymentInitiation : z, (i & 32) != 0 ? externalInstitutionDto.infoProvider : z3, (i & 64) != 0 ? externalInstitutionDto.topupSettings : jVar, (i & 128) != 0 ? externalInstitutionDto.requirements : list2, (i & 256) != 0 ? externalInstitutionDto.mandateInitiation : bool, (i & 512) != 0 ? externalInstitutionDto.nameSharingOnPaymentSupported : bool2, (i & 1024) != 0 ? externalInstitutionDto.health : healthDto, (i & 2048) != 0 ? externalInstitutionDto.tags : list3, (i & 4096) != 0 ? externalInstitutionDto.description : str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getNameSharingOnPaymentSupported() {
        return this.nameSharingOnPaymentSupported;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final HealthDto getHealth() {
        return this.health;
    }

    public final List<String> component12() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final a getLogo() {
        return this.logo;
    }

    public final List<BranchDto> component4() {
        return this.branches;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final j getTopupSettings() {
        return this.topupSettings;
    }

    public final List<Requirement> component8() {
        return this.requirements;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getMandateInitiation() {
        return this.mandateInitiation;
    }

    @NotNull
    public final ExternalInstitutionDto copy(@NotNull String id10, @NotNull String name, @NotNull a logo, List<BranchDto> branches, boolean paymentInitiation, boolean infoProvider, j topupSettings, List<Requirement> requirements, Boolean mandateInitiation, Boolean nameSharingOnPaymentSupported, HealthDto health, List<String> tags, String description) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logo, "logo");
        return new ExternalInstitutionDto(id10, name, logo, branches, paymentInitiation, infoProvider, topupSettings, requirements, mandateInitiation, nameSharingOnPaymentSupported, health, tags, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalInstitutionDto)) {
            return false;
        }
        ExternalInstitutionDto externalInstitutionDto = (ExternalInstitutionDto) other;
        return Intrinsics.f(this.id, externalInstitutionDto.id) && Intrinsics.f(this.name, externalInstitutionDto.name) && Intrinsics.f(this.logo, externalInstitutionDto.logo) && Intrinsics.f(this.branches, externalInstitutionDto.branches) && this.paymentInitiation == externalInstitutionDto.paymentInitiation && this.infoProvider == externalInstitutionDto.infoProvider && Intrinsics.f(this.topupSettings, externalInstitutionDto.topupSettings) && Intrinsics.f(this.requirements, externalInstitutionDto.requirements) && Intrinsics.f(this.mandateInitiation, externalInstitutionDto.mandateInitiation) && Intrinsics.f(this.nameSharingOnPaymentSupported, externalInstitutionDto.nameSharingOnPaymentSupported) && Intrinsics.f(this.health, externalInstitutionDto.health) && Intrinsics.f(this.tags, externalInstitutionDto.tags) && Intrinsics.f(this.description, externalInstitutionDto.description);
    }

    public final List<BranchDto> getBranches() {
        return this.branches;
    }

    public final String getDescription() {
        return this.description;
    }

    public final HealthDto getHealth() {
        return this.health;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    @NotNull
    public final a getLogo() {
        return this.logo;
    }

    public final Boolean getMandateInitiation() {
        return this.mandateInitiation;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final Boolean getNameSharingOnPaymentSupported() {
        return this.nameSharingOnPaymentSupported;
    }

    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    public final List<Requirement> getRequirements() {
        return this.requirements;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final j getTopupSettings() {
        return this.topupSettings;
    }

    public int hashCode() {
        int iHashCode = (this.logo.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name)) * 31;
        List<BranchDto> list = this.branches;
        int iC = j6.a.c(j6.a.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.paymentInitiation), 31, this.infoProvider);
        j jVar = this.topupSettings;
        int iHashCode2 = (iC + (jVar == null ? 0 : jVar.hashCode())) * 31;
        List<Requirement> list2 = this.requirements;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.mandateInitiation;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.nameSharingOnPaymentSupported;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HealthDto healthDto = this.health;
        int iHashCode6 = (iHashCode5 + (healthDto == null ? 0 : healthDto.hashCode())) * 31;
        List<String> list3 = this.tags;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.description;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ ExternalInstitutionDto(String str, String str2, a aVar, List list, boolean z, boolean z3, j jVar, List list2, Boolean bool, Boolean bool2, HealthDto healthDto, List list3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, list, z, z3, jVar, list2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : healthDto, list3, (i & 4096) != 0 ? null : str3);
    }
}
