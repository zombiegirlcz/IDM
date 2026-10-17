package tbi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADMINISTRATION;
    public static final a AGRICULTURE_FORESTRY_FISHERY;
    public static final a AGRICULTURE_GB;
    public static final a AGRICULTURE_IT;
    public static final a COMMERCE_N_TRADE;
    public static final a COMPANY_EMPLOYEE;
    public static final a CONSTRUCTION;
    public static final a CONSTRUCTION_TRANSPORT;
    public static final a CORPORATE_OFFICER;
    public static final a CRAFTSMANSHIP_N_HANDICRAFTS;
    public static final a CRAFT_N_RELATED_TRADES;
    public static final a CREDIT_N_FINANCE;
    public static final a ECCLESIASTICAL_ENTITIES;
    public static final a EDUCATION;
    public static final a EDUCATION_GB;
    public static final a FINANCIAL_SERVICES;
    public static final a FOOD_N_BEVERAGE;
    public static final a FOOD_PREP_N_CLEANING;
    public static final a GOVERNMENT_N_PUBLIC_ADMINISTRATION;
    public static final a HEALTH;
    public static final a HEALTHCARE;
    public static final a HEALTH_GB;
    public static final a HOMEMAKER_JP;
    public static final a HOMEMAKER_MX;
    public static final a INDUSTRY;
    public static final a IT_N_COMMUNICATION;
    public static final a IT_N_COMMUNICATION_GB;
    public static final a LEGAL_SOCIAL_CULTURAL;
    public static final a LEGAL_SOCIAL_CULTURAL_GB;
    public static final a MANAGEMENT;
    public static final a MANAGEMENT_GB;
    public static final a MINING;
    public static final a MINING_CONSTRUCTION_TRANSPORT;
    public static final a OTHER_SERVICES;
    public static final a OTHER_SERVICES_GB;
    public static final a PART_TIMER_OR_CONTRACT_EMPLOYEE;
    public static final a PLANT_N_MACHINE_OPERATIONS;
    public static final a POLITICAL_ORGANIZATIONS;
    public static final a PRIVATE_EMPLOYEE;
    public static final a PUBLIC_ADMINISTRATION_N_DEFENSE;
    public static final a PUBLIC_EDUCATION;
    public static final a PUBLIC_EMPLOYEE_JP;
    public static final a PUBLIC_EMPLOYEE_MX;
    public static final a REAL_ESTATE;
    public static final a RELIGIOUS_ORGANIZATIONS;
    public static final a RETIRED;
    public static final a RETIRED_GB;
    public static final a RETIRED_OR_UNEMPLOYED;
    public static final a SCIENCE_N_ENGINEERING;
    public static final a SCIENCE_N_TECHNOLOGY;
    public static final a SELF_EMPLOYED_DE;
    public static final a SELF_EMPLOYED_IN;
    public static final a SELF_EMPLOYED_MX;
    public static final a SERVICES;
    public static final a SERVICE_N_SALES;
    public static final a SERVICE_N_SALES_GB;
    public static final a SOLE_PROPRIETOR_OR_SELF_OWNED_BUSINESS;
    public static final a SPORTS_N_ARTS;
    public static final a STUDENT;
    public static final a STUDENT_GB;
    public static final a STUDENT_JP;
    public static final a TOURISM;
    public static final a UNEMPLOYED;
    public static final a UNEMPLOYED_GB;

    @NotNull
    private final String code;

    @NotNull
    private final Clause displayName;

    static {
        a aVar = new a(0, new TextLocalisedClause(R$string.onboarding_job_list_eu_administration, null, null, 14), "ADMINISTRATION", "administration");
        ADMINISTRATION = aVar;
        a aVar2 = new a(1, new TextLocalisedClause(R$string.onboarding_job_list_eu_agriculture_forestry_fishery, null, null, 14), "AGRICULTURE_FORESTRY_FISHERY", "agriculture_forestry_fishery");
        AGRICULTURE_FORESTRY_FISHERY = aVar2;
        a aVar3 = new a(2, new TextLocalisedClause(R$string.onboarding_job_list_uk_agriculture_forestry_fishery, null, null, 14), "AGRICULTURE_GB", "agriculture_forestry_fishery");
        AGRICULTURE_GB = aVar3;
        a aVar4 = new a(3, new TextLocalisedClause(R$string.onboarding_job_list_it_agriculture, null, null, 14), "AGRICULTURE_IT", "agriculture");
        AGRICULTURE_IT = aVar4;
        a aVar5 = new a(4, new TextLocalisedClause(R$string.onboarding_job_list_it_commerce_and_trade, null, null, 14), "COMMERCE_N_TRADE", "commerce_n_trade");
        COMMERCE_N_TRADE = aVar5;
        a aVar6 = new a(5, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_company_employee, null, null, 14), "COMPANY_EMPLOYEE", "company_employee");
        COMPANY_EMPLOYEE = aVar6;
        a aVar7 = new a(6, new TextLocalisedClause(R$string.onboarding_job_list_it_construction, null, null, 14), "CONSTRUCTION", "construction");
        CONSTRUCTION = aVar7;
        a aVar8 = new a(7, new TextLocalisedClause(R$string.onboarding_job_list_uk_construction_n_transport, null, null, 14), "CONSTRUCTION_TRANSPORT", "construction_n_transport");
        CONSTRUCTION_TRANSPORT = aVar8;
        a aVar9 = new a(8, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_corporate_officer, null, null, 14), "CORPORATE_OFFICER", "corporate_officer");
        CORPORATE_OFFICER = aVar9;
        a aVar10 = new a(9, new TextLocalisedClause(R$string.onboarding_job_list_eu_craft_n_related_trades, null, null, 14), "CRAFT_N_RELATED_TRADES", "craft_n_related_trades");
        CRAFT_N_RELATED_TRADES = aVar10;
        a aVar11 = new a(10, new TextLocalisedClause(R$string.onboarding_job_list_it_craftsmanship_and_handicrafts, null, null, 14), "CRAFTSMANSHIP_N_HANDICRAFTS", "craftsmanship_n_handicrafts");
        CRAFTSMANSHIP_N_HANDICRAFTS = aVar11;
        a aVar12 = new a(11, new TextLocalisedClause(R$string.onboarding_job_list_it_credit_and_finance, null, null, 14), "CREDIT_N_FINANCE", "credit_n_finance");
        CREDIT_N_FINANCE = aVar12;
        a aVar13 = new a(12, new TextLocalisedClause(R$string.onboarding_job_list_it_ecclesiastical_entities, null, null, 14), "ECCLESIASTICAL_ENTITIES", "ecclesiastical_entities");
        ECCLESIASTICAL_ENTITIES = aVar13;
        a aVar14 = new a(13, new TextLocalisedClause(R$string.onboarding_job_list_eu_education, null, null, 14), "EDUCATION", "education");
        EDUCATION = aVar14;
        a aVar15 = new a(14, new TextLocalisedClause(R$string.onboarding_job_list_uk_education, null, null, 14), "EDUCATION_GB", "education");
        EDUCATION_GB = aVar15;
        a aVar16 = new a(15, new TextLocalisedClause(R$string.onboarding_job_list_uk_financial_services, null, null, 14), "FINANCIAL_SERVICES", "financial_services");
        FINANCIAL_SERVICES = aVar16;
        a aVar17 = new a(16, new TextLocalisedClause(R$string.onboarding_job_list_uk_food_n_beverage, null, null, 14), "FOOD_N_BEVERAGE", "food_n_beverage");
        FOOD_N_BEVERAGE = aVar17;
        a aVar18 = new a(17, new TextLocalisedClause(R$string.onboarding_job_list_eu_food_prep_n_cleaning, null, null, 14), "FOOD_PREP_N_CLEANING", "food_prep_n_cleaning");
        FOOD_PREP_N_CLEANING = aVar18;
        a aVar19 = new a(18, new TextLocalisedClause(R$string.onboarding_job_list_uk_government_n_public_administration, null, null, 14), "GOVERNMENT_N_PUBLIC_ADMINISTRATION", "government_n_public_administration");
        GOVERNMENT_N_PUBLIC_ADMINISTRATION = aVar19;
        a aVar20 = new a(19, new TextLocalisedClause(R$string.onboarding_job_list_eu_health, null, null, 14), "HEALTH", "health");
        HEALTH = aVar20;
        a aVar21 = new a(20, new TextLocalisedClause(R$string.onboarding_job_list_uk_health, null, null, 14), "HEALTH_GB", "health");
        HEALTH_GB = aVar21;
        a aVar22 = new a(21, new TextLocalisedClause(R$string.onboarding_job_list_it_healthcare, null, null, 14), "HEALTHCARE", "healthcare");
        HEALTHCARE = aVar22;
        a aVar23 = new a(22, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_homemaker, null, null, 14), "HOMEMAKER_JP", "homemaker");
        HOMEMAKER_JP = aVar23;
        a aVar24 = new a(23, new TextLocalisedClause(R$string.onboarding_job_list_mx_homemaker, null, null, 14), "HOMEMAKER_MX", "homemaker");
        HOMEMAKER_MX = aVar24;
        a aVar25 = new a(24, new TextLocalisedClause(R$string.onboarding_job_list_it_industry, null, null, 14), "INDUSTRY", "industry");
        INDUSTRY = aVar25;
        a aVar26 = new a(25, new TextLocalisedClause(R$string.onboarding_job_list_eu_it_n_communication, null, null, 14), "IT_N_COMMUNICATION", "it_n_communication");
        IT_N_COMMUNICATION = aVar26;
        a aVar27 = new a(26, new TextLocalisedClause(R$string.onboarding_job_list_uk_it_n_communication, null, null, 14), "IT_N_COMMUNICATION_GB", "it_n_communication");
        IT_N_COMMUNICATION_GB = aVar27;
        a aVar28 = new a(27, new TextLocalisedClause(R$string.onboarding_job_list_eu_legal_social_cultural, null, null, 14), "LEGAL_SOCIAL_CULTURAL", "legal_social_cultural");
        LEGAL_SOCIAL_CULTURAL = aVar28;
        a aVar29 = new a(28, new TextLocalisedClause(R$string.onboarding_job_list_uk_legal_social_cultural, null, null, 14), "LEGAL_SOCIAL_CULTURAL_GB", "legal_social_cultural");
        LEGAL_SOCIAL_CULTURAL_GB = aVar29;
        a aVar30 = new a(29, new TextLocalisedClause(R$string.onboarding_job_list_eu_management, null, null, 14), "MANAGEMENT", "management");
        MANAGEMENT = aVar30;
        a aVar31 = new a(30, new TextLocalisedClause(R$string.onboarding_job_list_uk_management, null, null, 14), "MANAGEMENT_GB", "management");
        MANAGEMENT_GB = aVar31;
        a aVar32 = new a(31, new TextLocalisedClause(R$string.onboarding_job_list_uk_mining, null, null, 14), "MINING", "mining");
        MINING = aVar32;
        a aVar33 = new a(32, new TextLocalisedClause(R$string.onboarding_job_list_eu_mining_construction_transport, null, null, 14), "MINING_CONSTRUCTION_TRANSPORT", "mining_construction_transport");
        MINING_CONSTRUCTION_TRANSPORT = aVar33;
        a aVar34 = new a(33, new TextLocalisedClause(R$string.onboarding_job_list_eu_other_services, null, null, 14), "OTHER_SERVICES", "other_services");
        OTHER_SERVICES = aVar34;
        a aVar35 = new a(34, new TextLocalisedClause(R$string.onboarding_job_list_uk_other_services, null, null, 14), "OTHER_SERVICES_GB", "other_services");
        OTHER_SERVICES_GB = aVar35;
        a aVar36 = new a(35, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_part_timer_contract_employee, null, null, 14), "PART_TIMER_OR_CONTRACT_EMPLOYEE", "part_timer_or_contract_employee");
        PART_TIMER_OR_CONTRACT_EMPLOYEE = aVar36;
        a aVar37 = new a(36, new TextLocalisedClause(R$string.onboarding_job_list_eu_plant_n_machine_operations, null, null, 14), "PLANT_N_MACHINE_OPERATIONS", "plant_n_machine_operations");
        PLANT_N_MACHINE_OPERATIONS = aVar37;
        a aVar38 = new a(37, new TextLocalisedClause(R$string.onboarding_job_list_mx_political_organizations, null, null, 14), "POLITICAL_ORGANIZATIONS", "political_organisations");
        POLITICAL_ORGANIZATIONS = aVar38;
        a aVar39 = new a(38, new TextLocalisedClause(R$string.onboarding_job_list_mx_private_employee, null, null, 14), "PRIVATE_EMPLOYEE", "private_employee");
        PRIVATE_EMPLOYEE = aVar39;
        a aVar40 = new a(39, new TextLocalisedClause(R$string.onboarding_job_list_it_public_administration_and_defense, null, null, 14), "PUBLIC_ADMINISTRATION_N_DEFENSE", "public_administration_n_defense");
        PUBLIC_ADMINISTRATION_N_DEFENSE = aVar40;
        a aVar41 = new a(40, new TextLocalisedClause(R$string.onboarding_job_list_it_public_education, null, null, 14), "PUBLIC_EDUCATION", "public_education");
        PUBLIC_EDUCATION = aVar41;
        a aVar42 = new a(41, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_public_employee, null, null, 14), "PUBLIC_EMPLOYEE_JP", "public_employee");
        PUBLIC_EMPLOYEE_JP = aVar42;
        a aVar43 = new a(42, new TextLocalisedClause(R$string.onboarding_job_list_mx_public_employee, null, null, 14), "PUBLIC_EMPLOYEE_MX", "public_employee");
        PUBLIC_EMPLOYEE_MX = aVar43;
        a aVar44 = new a(43, new TextLocalisedClause(R$string.onboarding_job_list_uk_real_estate, null, null, 14), "REAL_ESTATE", "real_estate");
        REAL_ESTATE = aVar44;
        a aVar45 = new a(44, new TextLocalisedClause(R$string.onboarding_job_list_mx_religious_organizations, null, null, 14), "RELIGIOUS_ORGANIZATIONS", "religious_organisations");
        RELIGIOUS_ORGANIZATIONS = aVar45;
        a aVar46 = new a(45, new TextLocalisedClause(R$string.onboarding_job_list_eu_retired, null, null, 14), "RETIRED", "retired");
        RETIRED = aVar46;
        a aVar47 = new a(46, new TextLocalisedClause(R$string.onboarding_job_list_uk_retired, null, null, 14), "RETIRED_GB", "retired");
        RETIRED_GB = aVar47;
        a aVar48 = new a(47, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_retired_unemployed, null, null, 14), "RETIRED_OR_UNEMPLOYED", "retired_or_unemployed");
        RETIRED_OR_UNEMPLOYED = aVar48;
        a aVar49 = new a(48, new TextLocalisedClause(R$string.onboarding_job_list_eu_science_n_engineering, null, null, 14), "SCIENCE_N_ENGINEERING", "science_n_engineering");
        SCIENCE_N_ENGINEERING = aVar49;
        a aVar50 = new a(49, new TextLocalisedClause(R$string.onboarding_job_list_uk_science_n_technology, null, null, 14), "SCIENCE_N_TECHNOLOGY", "science_n_technology");
        SCIENCE_N_TECHNOLOGY = aVar50;
        a aVar51 = new a(50, new TextLocalisedClause(R$string.onboarding_job_list_eu_self_employed, null, null, 14), "SELF_EMPLOYED_DE", "self_employed");
        SELF_EMPLOYED_DE = aVar51;
        a aVar52 = new a(51, new TextLocalisedClause(R$string.onboarding_job_list_in_self_employed, null, null, 14), "SELF_EMPLOYED_IN", "self_employed");
        SELF_EMPLOYED_IN = aVar52;
        a aVar53 = new a(52, new TextLocalisedClause(R$string.onboarding_job_list_mx_self_employed, null, null, 14), "SELF_EMPLOYED_MX", "self_employed");
        SELF_EMPLOYED_MX = aVar53;
        a aVar54 = new a(53, new TextLocalisedClause(R$string.onboarding_job_list_eu_service_n_sales, null, null, 14), "SERVICE_N_SALES", "service_n_sales");
        SERVICE_N_SALES = aVar54;
        a aVar55 = new a(54, new TextLocalisedClause(R$string.onboarding_job_list_uk_service_n_sales, null, null, 14), "SERVICE_N_SALES_GB", "service_n_sales");
        SERVICE_N_SALES_GB = aVar55;
        a aVar56 = new a(55, new TextLocalisedClause(R$string.onboarding_job_list_it_services, null, null, 14), "SERVICES", "services");
        SERVICES = aVar56;
        a aVar57 = new a(56, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_sole_proprietor_self_owned_business, null, null, 14), "SOLE_PROPRIETOR_OR_SELF_OWNED_BUSINESS", "sole_proprietor_or_self_owned_business");
        SOLE_PROPRIETOR_OR_SELF_OWNED_BUSINESS = aVar57;
        a aVar58 = new a(57, new TextLocalisedClause(R$string.onboarding_job_list_it_sports_and_arts, null, null, 14), "SPORTS_N_ARTS", "sports_n_arts");
        SPORTS_N_ARTS = aVar58;
        a aVar59 = new a(58, new TextLocalisedClause(R$string.onboarding_job_list_eu_student, null, null, 14), "STUDENT", "student");
        STUDENT = aVar59;
        a aVar60 = new a(59, new TextLocalisedClause(R$string.onboarding_job_list_uk_student, null, null, 14), "STUDENT_GB", "student");
        STUDENT_GB = aVar60;
        a aVar61 = new a(60, new TextLocalisedClause(R$string.onboarding_job_list_jp_emoji_student, null, null, 14), "STUDENT_JP", "student");
        STUDENT_JP = aVar61;
        a aVar62 = new a(61, new TextLocalisedClause(R$string.onboarding_job_list_it_tourism, null, null, 14), "TOURISM", "tourism");
        TOURISM = aVar62;
        a aVar63 = new a(62, new TextLocalisedClause(R$string.onboarding_job_list_eu_unemployed, null, null, 14), "UNEMPLOYED", "unemployed");
        UNEMPLOYED = aVar63;
        a aVar64 = new a(63, new TextLocalisedClause(R$string.onboarding_job_list_uk_unemployed, null, null, 14), "UNEMPLOYED_GB", "unemployed");
        UNEMPLOYED_GB = aVar64;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33, aVar34, aVar35, aVar36, aVar37, aVar38, aVar39, aVar40, aVar41, aVar42, aVar43, aVar44, aVar45, aVar46, aVar47, aVar48, aVar49, aVar50, aVar51, aVar52, aVar53, aVar54, aVar55, aVar56, aVar57, aVar58, aVar59, aVar60, aVar61, aVar62, aVar63, aVar64};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(int i, TextLocalisedClause textLocalisedClause, String str, String str2) {
        this.displayName = textLocalisedClause;
        this.code = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final Clause a() {
        return this.displayName;
    }

    public final String getCode() {
        return this.code;
    }
}
